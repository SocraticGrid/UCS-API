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
 * @created 16-Dec-2013 3:54:58 PM
 */
public class UpdateException extends UCSException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpdateException(){

	}

	/**
	 * @param fault
	 */
	public UpdateException(String fault)
	{
		super(fault);
	}

	/**
	 * @param fault
	 * @param msg
	 */
	public UpdateException(String fault, Message msg)
	{
		super(fault, msg);
	}

	/**
	 * @param fault
	 * @param service
	 * @param msg
	 */
	public UpdateException(String fault, String service, Message msg)
	{
		super(fault, service, msg);
	}


}