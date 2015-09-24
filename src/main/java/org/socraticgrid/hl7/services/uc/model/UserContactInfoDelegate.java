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
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.jws.WebMethod;

/**
 * @author steven
 * 
 */
public class UserContactInfoDelegate extends UserContactInfo {

	private static final long serialVersionUID = 1L;

	@Override
	public Map<String, PhysicalAddress> getAddressesByType() {
		Map<String, PhysicalAddress> addressesByType = new LinkedHashMap<>();
		for(int i=0; i<addresses.size(); i++) {
			addressesByType.put(types.get(i),addresses.get(i));
		}
		return addressesByType;
	}
	
	private LinkedList<PhysicalAddress> addresses = new LinkedList<>();
	private LinkedList<String> types = new LinkedList<>();

	@WebMethod(exclude=true)
	public LinkedList<PhysicalAddress> getAddresses()
	{
		return addresses;
	}
	@WebMethod(exclude=true)
	public void setAddresses(LinkedList<PhysicalAddress> addresses)
	{
		this.addresses = addresses;
	}
	@WebMethod(exclude=true)
	public LinkedList<String> getTypes() {
		return types;
	}
	@WebMethod(exclude=true)
	public void setTypes(LinkedList<String> types) {
		this.types = types;
	}

}