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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.socraticgrid.hl7.services.uc.exceptions.ProcessingException;

/**
 * 
 * @author steven
 *
 */
public class MessageBodyExceptionsDelegate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Set<MessageBody> parts = new HashSet<>();
	private Set<ProcessingException> exceptions = new HashSet<>();
	
	
	public Set<MessageBody> getParts() {
		return parts;
	}
	public void setParts(Set<MessageBody> parts) {
		this.parts = parts;
	}
	public MessageBody[] getPartsArray(){
		return parts.toArray(new MessageBody[parts.size()]);
	}
	public Set<ProcessingException> getExceptions() {
		return exceptions;
	}
	public void setExceptions(Set<ProcessingException> exceptions) {
		this.exceptions = exceptions;
	}
	public List<ProcessingException> getExceptionsList() {
		List<ProcessingException> list = new ArrayList<>();
		list.addAll(exceptions);
		return list;
	}

}