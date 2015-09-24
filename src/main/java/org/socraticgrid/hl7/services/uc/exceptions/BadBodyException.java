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
 * @created 16-Dec-2013 3:54:56 PM
 */
public class BadBodyException extends InvalidContentException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String faultDescription;
	public int indexToInvalidBody;

	public BadBodyException(){

	}
	

	/**
	 * @param fault
	 * @param generatingMessage
	 */
	public BadBodyException(String fault, Message generatingMessage)
	{
		super(fault, generatingMessage);
		
	}


	/**
	 * @param fault
	 * @param service
	 * @param msg
	 */
	public BadBodyException(String fault, String service, Message msg)
	{
		super(fault, service, msg);
		
	}
	/**
	 * @param fault
	 * @param service
	 * @param msg
	 * @param faultDesc
	 * @param index
	 */
	public BadBodyException(String fault, String service, Message msg,String faultDesc, int index)
	{
		super(fault, service, msg);
		this.faultDescription=faultDesc;
		this.indexToInvalidBody=index;
	}


	/**
	 * @param fault
	 */
	public BadBodyException(String fault)
	{
		super(fault);
		
	}


	public String getFaultDescription()
	{
		return faultDescription;
	}

	public void setFaultDescription(String faultDescription)
	{
		this.faultDescription = faultDescription;
	}

	public int getIndexToInvalidBody()
	{
		return indexToInvalidBody;
	}

	public void setIndexToInvalidBody(int indexToInvalidBody)
	{
		this.indexToInvalidBody = indexToInvalidBody;
	}

}