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
package org.socraticgrid.hl7.services.uc.exceptions;

import java.io.Serializable;

import org.socraticgrid.hl7.services.uc.model.Message;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 17-Dec-2013 2:08:31 PM
 */
public class DeliveryException extends UCSException  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String messageId;

	public DeliveryException(){

	}

	/**
	 * @param fault
	 */
	public DeliveryException(String fault)
	{
		super(fault);
		
	}

	/**
	 * @param fault
	 * @param msg
	 */
	public DeliveryException(String fault, Message msg)
	{
		super(fault, msg);
		
	}

	/**
	 * @param fault
	 * @param service
	 * @param msg
	 */
	public DeliveryException(String fault, String service, Message msg)
	{
		super(fault, service, msg);

	}


	public String getMessageId()
	{
		return messageId;
	}

	public void setMessageId(String messageId)
	{
		this.messageId = messageId;
	}

}