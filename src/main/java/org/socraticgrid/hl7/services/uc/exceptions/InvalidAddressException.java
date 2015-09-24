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
import java.util.LinkedList;
import java.util.List;

import org.socraticgrid.hl7.services.uc.model.DeliveryAddress;
import org.socraticgrid.hl7.services.uc.model.Message;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:56 PM
 */
public class InvalidAddressException extends InvalidMessageException  implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<DeliveryAddress> invalidAddresses;

	public InvalidAddressException()
	{
		invalidAddresses=new LinkedList<DeliveryAddress>();
	}

	/**
	 * @param invalidAddresses
	 */
	public InvalidAddressException(
			List<DeliveryAddress> invalidAddresses)
	{
		super();
		this.invalidAddresses = invalidAddresses;
	}

	/**
	 * @param fault
	 * @param generatingMessage
	 */
	public InvalidAddressException(String fault, Message generatingMessage)
	{
		super(fault, generatingMessage);
		invalidAddresses=new LinkedList<DeliveryAddress>();
	}

	/**
	 * @param fault
	 * @param service
	 * @param msg
	 */
	public InvalidAddressException(String fault, String service, Message msg)
	{
		super(fault, service, msg);
		invalidAddresses=new LinkedList<DeliveryAddress>();
	}

	/**
	 * @param fault
	 */
	public InvalidAddressException(String fault)
	{
		super(fault);

	}



	public List<DeliveryAddress> getInvalidAddresses()
	{
		return invalidAddresses;
	}

	public void setInvalidAddresses(List<DeliveryAddress> invalidAddresses)
	{
		this.invalidAddresses = invalidAddresses;
	}

}