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
 * Responsible for Dealing with Message Exceptions
 * 
 * @author Jerry Goodnough
 * @version 1.0
 * @updated 17-Dec-2013 1:57:52 PM
 */
public class UCSException extends java.lang.Exception implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fault;
	private Message generatingMessage;
	private String issuingService;

	public UCSException()
	{
		super();
	}

	public UCSException(String fault)
	{
		super(fault);
		this.fault = fault;		
	}

	public UCSException(String fault, Message msg)
	{
		super(fault);
		this.fault = fault;
		this.generatingMessage = msg;
	}

	public UCSException(String fault, String service, Message msg)
	{
		super(fault);
		this.fault = fault;
		this.issuingService = service;
		this.generatingMessage = msg;
	}

	public String getFault()
	{
		return fault;
	}

	public Message getGeneratingMessage()
	{
		return generatingMessage;
	}

	public String getIssuingService()
	{
		return issuingService;
	}

	public void setFault(String fault)
	{
		this.fault = fault;
	}

	public void setGeneratingMessage(Message generatingMessage)
	{
		this.generatingMessage = generatingMessage;
	}

	public void setIssuingService(String issuingService)
	{
		this.issuingService = issuingService;
	}
}