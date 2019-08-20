package com.microsoft.azure.servicebus.jms;

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
            ConnectionFactory f = SBJmsConnectionFactory.create(builder);
            
            connection = f.createConnection();
            connection.start();
            session = connection.createSession(false, 1);
            Destination destination = session.createQueue(builder.getEntityPath());
            consumer = session.createConsumer(destination);
            producer = session.createProducer(destination);
            
            TextMessage textMsg = session.createTextMessage("my message.");
            producer.send(textMsg);
            javax.jms.Message msg = consumer.receive(2000);
            String receivedText = ((TextMessage) msg).getText();
            System.out.println("RECEIVED: " + receivedText);
        } finally {
            consumer.close();
            producer.close();
            session.close();
            connection.close();
        }
    }
}
