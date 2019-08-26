package com.microsoft.azure.servicebus.jms;

import static org.junit.Assert.assertEquals;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.junit.Test;

import com.microsoft.azure.servicebus.TestUtils;
import com.microsoft.azure.servicebus.primitives.ConnectionStringBuilder;

public class ConnectionFactoryTests {
    
    @Test
    public void sendAndReceiveTest() throws JMSException {
        Connection connection = null;
        Session session = null;
        MessageConsumer consumer = null;
        MessageProducer producer = null;
        
        try {
            String connectionString = TestUtils.getNamespaceConnectionString();
            ConnectionStringBuilder builder = new ConnectionStringBuilder(connectionString);
            ServiceBusJmsConnectionFactorySettings settings = new ServiceBusJmsConnectionFactorySettings(120000, true);
            ConnectionFactory f = new ServiceBusJmsConnectionFactory(builder, settings);
            
            connection = f.createConnection();
            connection.start();
            session = connection.createSession(false, 1);
            Destination destination = session.createQueue(builder.getEntityPath());
            consumer = session.createConsumer(destination);
            producer = session.createProducer(destination);
            
            String testMessage = "my message.";
            TextMessage textMsg = session.createTextMessage(testMessage);
            producer.send(textMsg);
            javax.jms.Message msg = consumer.receive(2000);
            String receivedText = ((TextMessage) msg).getText();
            assertEquals(testMessage, receivedText);
        } finally {
            consumer.close();
            producer.close();
            session.close();
            connection.close();
        }
    }
}
