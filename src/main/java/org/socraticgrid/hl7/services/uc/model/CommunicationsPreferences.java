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
import java.util.HashMap;

public class CommunicationsPreferences implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public CommunicationsPreferences() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public HashMap<String, PhysicalAddress> getAddessesByType() {
		return addessesByType;
	}

	public void setAddessesByType(HashMap<String, PhysicalAddress> addessesByType) {
		this.addessesByType = addessesByType;
	}

	public PhysicalAddress getPreferredAddress() {
		return preferredAddress;
	}

	public void setPreferredAddress(PhysicalAddress preferredAddress) {
		this.preferredAddress = preferredAddress;
	}

	private String endpoint; // Service endpoint (UCS Client)
	private HashMap<String, PhysicalAddress> addessesByType;
	private PhysicalAddress preferredAddress;
}
