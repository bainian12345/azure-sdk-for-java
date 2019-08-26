package com.microsoft.azure.servicebus.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import org.apache.qpid.jms.JmsConnectionFactory;
import com.microsoft.azure.servicebus.primitives.ConnectionStringBuilder;

public class ServiceBusJmsConnectionFactory implements ConnectionFactory {
    private JmsConnectionFactory factory;
    
    public ServiceBusJmsConnectionFactory(String connectionString, ServiceBusJmsConnectionFactorySettings settings) {
        this(new ConnectionStringBuilder(connectionString), settings);
    }
    
    public ServiceBusJmsConnectionFactory(ConnectionStringBuilder connectionStringBuilder, ServiceBusJmsConnectionFactorySettings settings) {
        this(connectionStringBuilder.getSasKeyName(),
                connectionStringBuilder.getSasKey(),
                connectionStringBuilder.getEndpoint().getHost(),
                settings);
    }
    
    public ServiceBusJmsConnectionFactory(String sasKeyName, String sasKey, String host, ServiceBusJmsConnectionFactorySettings settings) {
        if (sasKeyName == null || sasKeyName == null || host == null) {
            throw new IllegalArgumentException("SAS Key, SAS KeyName and the host cannot be null for a ServiceBus connection factory.");
        }
        
        String query = (settings == null) ? "" : settings.toQuery();
        this.factory = new JmsConnectionFactory(sasKeyName, sasKey, "amqps://" + host + query);
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
