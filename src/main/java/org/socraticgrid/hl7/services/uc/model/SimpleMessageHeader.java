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

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:57 PM
 */
public class SimpleMessageHeader extends MessageHeader implements Serializable {

	
	
	SimpleMessageHeader(String id) {
		super(id);
	}
	
	public SimpleMessageHeader()
	{
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserContactInfo getReplyTo()
	{
		return replyTo;
	}

	public void setReplyTo(UserContactInfo replyTo)
	{
		this.replyTo = replyTo;
	}

	private UserContactInfo replyTo; //User Id

	
	@Override
	public MessageType getMessageType() {
		return MessageType.SimpleMessage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SimpleMessageHeader [replyTo=" + replyTo + ", toString()="
				+ super.toString() + "]";
	}


}