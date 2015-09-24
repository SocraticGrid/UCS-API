/* 
 * Copyright 2015 Cognitive Medical Systems, Inc (http://www.cognitivemedciine.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socraticgrid.hl7.services.uc.model;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebMethod;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:58 PM
 */
public class UserContactInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userContactInfoId;
	private String name;
	private String endpoint;  //Service endpoint (UCS Client)
	private Map<String, PhysicalAddress> addressesByType = new LinkedHashMap<>();
	private PhysicalAddress preferredAddress;


	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEndpoint()
	{
		return endpoint;
	}

	public void setEndpoint(String endpoint)
	{
		this.endpoint = endpoint;
	}

	public PhysicalAddress getPreferredAddress()
	{
		return preferredAddress;
	}

	public void setPreferredAddress(PhysicalAddress preferredAddress)
	{
		this.preferredAddress = preferredAddress;
	}

	/**
	 * To build from persistence.
	 */
	@WebMethod(exclude = true)
	public String getUserContactInfoId() {
		return userContactInfoId;
	}
	@WebMethod(exclude = true)
	public void setUserContactInfoId(String userContactInfoId) {
		this.userContactInfoId = userContactInfoId;
	}
	@WebMethod(exclude = true)
	private String getPreferredAddressId() {
		if(preferredAddress==null){
			return null;
		}
		return preferredAddress.getAddressId();
	}
	@WebMethod(exclude = true)
	private void setPreferredAddressId(String userContactInfoId) {
		//
	}

	public Map<String, PhysicalAddress> getAddressesByType() {
		return addressesByType;
	}

	public void setAddressesByType(Map<String, PhysicalAddress> addressesByType) {
		this.addressesByType = addressesByType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserContactInfo [userContactInfoId=" + userContactInfoId
				+ ", name=" + name + ", endpoint=" + endpoint
				+ ", addressesByType=" + addressesByType
				+ ", preferredAddress=" + preferredAddress + "]";
	}

}