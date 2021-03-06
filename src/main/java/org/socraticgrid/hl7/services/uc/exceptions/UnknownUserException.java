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

import org.socraticgrid.hl7.services.uc.model.Message;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:58 PM
 */
public class UnknownUserException extends UCSException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnknownUserException(){

	}



	/**
	 * @param fault
	 * @param msg
	 */
	public UnknownUserException(String fault, Message msg)
	{
		super(fault, msg);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fault
	 * @param service
	 * @param msg
	 */
	public UnknownUserException(String fault, String service, Message msg)
	{
		super(fault, service, msg);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fault
	 */
	public UnknownUserException(String fault)
	{
		super(fault);
		// TODO Auto-generated constructor stub
	}

}