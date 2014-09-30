/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.credentials;

public class AdalAuthConfig {
	private String authorityUrl;
	private String tenantId;
	private String resource;
	private String clientId;
	private String clientSecret;
	
	public AdalAuthConfig(String authorityUrl, String tenantId, String resource, String clientId, String clientSecret)
	{
		this.authorityUrl = authorityUrl;
		this.tenantId = tenantId;
		this.resource = resource;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}
	
	public String getAuthorityUrl()
	{
		return this.authorityUrl;
	}
	
	public String getTenantId()
	{
		return this.tenantId;
	}
	
	public String getResource()
	{
		return this.resource;
	}
	
	public String getClientId()
	{
		return this.clientId;
	}
	
	public String getClientSecret()
	{
		return this.clientSecret;
	}
	
	public void setClientSecret(String clientSecret)
	{
		this.clientSecret = clientSecret;
	}
}
