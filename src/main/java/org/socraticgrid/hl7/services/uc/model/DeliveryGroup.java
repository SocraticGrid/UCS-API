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

import java.util.LinkedList;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:56 PM
 */
public class DeliveryGroup
{

	private String name;
	private LinkedList<DeliveryAddress> group;
	private UserContactInfo userContactInfo;

	public DeliveryGroup()
	{

	}



	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public LinkedList<DeliveryAddress> getGroup()
	{
		return group;
	}

	public void setGroup(LinkedList<DeliveryAddress> group)
	{
		this.group = group;
	}

	public UserContactInfo getUserContactInfo()
	{
		return userContactInfo;
	}

	public void setUserContactInfo(UserContactInfo userContactInfo)
	{
		this.userContactInfo = userContactInfo;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DeliveryGroup [name=" + name + ", group=" + group
				+ ", userContactInfo=" + userContactInfo + "]";
	}

}