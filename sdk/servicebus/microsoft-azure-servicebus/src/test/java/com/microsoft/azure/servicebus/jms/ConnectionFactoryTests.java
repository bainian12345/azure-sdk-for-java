package com.microsoft.azure.servicebus.jms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.JMSSecurityException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.junit.Test;

import com.microsoft.azure.servicebus.TestUtils;
import com.microsoft.azure.servicebus.primitives.ConnectionStringBuilder;

public class ConnectionFactoryTests {
  private static final String CONNECTION_STRING = TestUtils.getNamespaceConnectionString();
  private static final String DEFAULT_ENTITY_NAME = "test-jms-entity";
  
    @Test
    public void sendAndReceiveTest() throws JMSException {
        Connection connection = null;
        Session session = null;
        MessageConsumer consumer = null;
        MessageProducer queueProducer = null;
        MessageProducer topicProducer = null;
        
        try {
            ConnectionStringBuilder builder = new ConnectionStringBuilder(CONNECTION_STRING);
            ServiceBusJmsConnectionFactorySettings settings = new ServiceBusJmsConnectionFactorySettings(120000, true);
            ConnectionFactory cf = new ServiceBusJmsConnectionFactory(builder, settings);
            
            connection = cf.createConnection();
            connection.start();
            session = connection.createSession(false, 1);
            Queue queue = session.createQueue(DEFAULT_ENTITY_NAME);
            consumer = session.createConsumer(queue);
            queueProducer = session.createProducer(queue);
            
            String testMessage = "my message.";
            TextMessage textMsg = session.createTextMessage(testMessage);
            queueProducer.send(textMsg);
            javax.jms.Message msg = consumer.receive(2000);
            String receivedText = ((TextMessage) msg).getText();
            assertEquals(testMessage, receivedText);
            
            Topic topic = session.createTopic(DEFAULT_ENTITY_NAME);
            topicProducer = session.createProducer(topic);
            topicProducer.send(textMsg);
        } finally {
            if (consumer != null) consumer.close();
            if (queueProducer != null) queueProducer.close();
            if (topicProducer != null) topicProducer.close();
            if (session != null) session.close();
            if (connection != null) connection.close();
        }
    }
    
    @Test
    public void createEntityInvalidSasTest() throws JMSException {
        Connection connection = null;
        Session session = null;
        MessageConsumer consumer = null;
        MessageProducer producer = null;
        String invalidSasConnectionString = CONNECTION_STRING.valueOf(CONNECTION_STRING).replaceAll("(SharedAccessKey=)(.*)(=;)", "SharedAccessKey=BadSasKey=;");
        
        try {
            ConnectionStringBuilder builder = new ConnectionStringBuilder(invalidSasConnectionString);
            ServiceBusJmsConnectionFactorySettings settings = new ServiceBusJmsConnectionFactorySettings(120000, true);
            ConnectionFactory cf = new ServiceBusJmsConnectionFactory(builder, settings);
            
            connection = cf.createConnection();
            connection.start();
            session = connection.createSession(false, 1);
            Queue queue = session.createQueue(DEFAULT_ENTITY_NAME);
            Topic topic = session.createTopic(DEFAULT_ENTITY_NAME);
            
            consumer = session.createConsumer(queue);
            fail("create consumer should have failed because of failed authorization.");
        } catch (Exception e) {
            assertEquals("The exception type should be JMSSecurityException.", JMSSecurityException.class, e.getClass());
        } finally {
            if (consumer != null) consumer.close();
            if (producer != null) producer.close();
            if (session != null) session.close();
            if (connection != null) connection.close();
        }
    }
}
