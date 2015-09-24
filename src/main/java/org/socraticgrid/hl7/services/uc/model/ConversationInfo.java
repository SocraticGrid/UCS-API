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
import java.util.List;

public class ConversationInfo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Conversation conversation;
	List<String> messages;

	/**
	 * 
	 */
	public ConversationInfo()
	{
		super();

	}

	public Conversation getConversation()
	{
		return conversation;
	}

	public List<String> getMessages()
	{
		return messages;
	}

	public void setConversation(Conversation conversation)
	{
		this.conversation = conversation;
	}

	public void setMessages(List<String> messages)
	{
		this.messages = messages;
	}

}
