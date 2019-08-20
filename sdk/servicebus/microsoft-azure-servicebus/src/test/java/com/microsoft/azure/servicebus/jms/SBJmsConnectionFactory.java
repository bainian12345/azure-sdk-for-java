package com.microsoft.azure.servicebus.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import org.apache.qpid.jms.JmsConnectionFactory;
import com.microsoft.azure.servicebus.primitives.ConnectionStringBuilder;

public class SBJmsConnectionFactory implements ConnectionFactory {
    private JmsConnectionFactory factory;

    private SBJmsConnectionFactory(String sasKeyName, String sasKey, String host) {
        if (sasKeyName == null || sasKeyName == null || host == null) {
            throw new IllegalArgumentException("SAS Key, SAS KeyName and the host cannot be null for a ServiceBus connection factory.");
        }
        
        this.factory = new JmsConnectionFactory(sasKeyName, sasKey, "amqps://" + host + "?amqp.idleTimeout=120000&amqp.traceFrames=true");
    }
    
    public static ConnectionFactory create(String connectionString) {
        return create(new ConnectionStringBuilder(connectionString));
    }
    
    public static ConnectionFactory create(ConnectionStringBuilder connectionStringBuilder) {
        if (connectionStringBuilder == null || connectionStringBuilder.getEndpoint() == null) {
            throw new IllegalArgumentException("The ConnectionStringBuilder or its connection string is invalid.");
        }
        return new SBJmsConnectionFactory(
                connectionStringBuilder.getSasKeyName(),
                connectionStringBuilder.getSasKey(),
                connectionStringBuilder.getEndpoint().getHost());
    }
    
    @Override
    public Connection createConnection() throws JMSException {
        return this.factory.createConnection();
    }

    @Override
    public Connection createConnection(String userName, String password) throws JMSException {
        return this.factory.createConnection(userName, password);
    }

    @Override
    public JMSContext createContext() {
        return this.factory.createContext();
    }

    @Override
    public JMSContext createContext(int sessionMode) {
        return this.factory.createContext(sessionMode);
    }

    @Override
    public JMSContext createContext(String userName, String password) {
        return this.factory.createContext(userName, password);
    }

    @Override
    public JMSContext createContext(String userName, String password, int sessionMode) {
        return this.factory.createContext(userName, password, sessionMode);
    }

}
