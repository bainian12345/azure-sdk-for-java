// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.virtualnetworks.models;

import com.microsoft.windowsazure.management.OperationResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The response to a ListConnections request to a Virtual Network Gateway
*/
public class GatewayListConnectionsResponse extends OperationResponse implements Iterable<GatewayListConnectionsResponse.GatewayConnection>
{
    private ArrayList<GatewayListConnectionsResponse.GatewayConnection> connections;
    
    /**
    * The list of connections
    */
    public ArrayList<GatewayListConnectionsResponse.GatewayConnection> getConnections() { return this.connections; }
    
    /**
    * The list of connections
    */
    public void setConnections(ArrayList<GatewayListConnectionsResponse.GatewayConnection> connections) { this.connections = connections; }
    
    /**
    * Initializes a new instance of the GatewayListConnectionsResponse class.
    *
    */
    public GatewayListConnectionsResponse()
    {
        this.connections = new ArrayList<GatewayListConnectionsResponse.GatewayConnection>();
    }
    
    /**
    * Gets the sequence of Connections.
    *
    */
    public Iterator<GatewayListConnectionsResponse.GatewayConnection> iterator()
    {
        return this.getConnections().iterator();
    }
    
    public static class GatewayConnection
    {
        private ArrayList<String> allocatedIPAddresses;
        
        /**
        * If LocalNetworkSiteName is defined as VPNClientConnection, this
        * element contains a list of IP addresses (represented as strings)
        * that are assigned to currently connected VPN clients.
        */
        public ArrayList<String> getAllocatedIPAddresses() { return this.allocatedIPAddresses; }
        
        /**
        * If LocalNetworkSiteName is defined as VPNClientConnection, this
        * element contains a list of IP addresses (represented as strings)
        * that are assigned to currently connected VPN clients.
        */
        public void setAllocatedIPAddresses(ArrayList<String> allocatedIPAddresses) { this.allocatedIPAddresses = allocatedIPAddresses; }
        
        private GatewayConnectivityState connectivityState;
        
        /**
        * The connection state of the site. You can set the connection state to
        * Connected, Connecting or NotConnected.
        */
        public GatewayConnectivityState getConnectivityState() { return this.connectivityState; }
        
        /**
        * The connection state of the site. You can set the connection state to
        * Connected, Connecting or NotConnected.
        */
        public void setConnectivityState(GatewayConnectivityState connectivityState) { this.connectivityState = connectivityState; }
        
        private long egressBytesTransferred;
        
        /**
        * The number of bytes of data transferred out through this connection
        * since it was started
        */
        public long getEgressBytesTransferred() { return this.egressBytesTransferred; }
        
        /**
        * The number of bytes of data transferred out through this connection
        * since it was started
        */
        public void setEgressBytesTransferred(long egressBytesTransferred) { this.egressBytesTransferred = egressBytesTransferred; }
        
        private long ingressBytesTransferred;
        
        /**
        * The number of bytes of data transferred in through this connection
        * since it was started
        */
        public long getIngressBytesTransferred() { return this.ingressBytesTransferred; }
        
        /**
        * The number of bytes of data transferred in through this connection
        * since it was started
        */
        public void setIngressBytesTransferred(long ingressBytesTransferred) { this.ingressBytesTransferred = ingressBytesTransferred; }
        
        private Calendar lastConnectionEstablished;
        
        public Calendar getLastConnectionEstablished() { return this.lastConnectionEstablished; }
        
        public void setLastConnectionEstablished(Calendar lastConnectionEstablished) { this.lastConnectionEstablished = lastConnectionEstablished; }
        
        private GatewayEvent lastEvent;
        
        /**
        * A record of the last provisioning event for this connection.
        */
        public GatewayEvent getLastEvent() { return this.lastEvent; }
        
        /**
        * A record of the last provisioning event for this connection.
        */
        public void setLastEvent(GatewayEvent lastEvent) { this.lastEvent = lastEvent; }
        
        private String localNetworkSiteName;
        
        /**
        * The name of the local network site represented by the connection
        */
        public String getLocalNetworkSiteName() { return this.localNetworkSiteName; }
        
        /**
        * The name of the local network site represented by the connection
        */
        public void setLocalNetworkSiteName(String localNetworkSiteName) { this.localNetworkSiteName = localNetworkSiteName; }
        
        /**
        * Initializes a new instance of the GatewayConnection class.
        *
        */
        public GatewayConnection()
        {
            this.allocatedIPAddresses = new ArrayList<String>();
        }
    }
}
