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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;


/**
 * @author steven
 * @param <E>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageModel<T extends Message> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@XmlElements(value = { 
            @XmlElement(name="notification", 
                        type=NotificationMessage.class),
            @XmlElement(name="alert", 
                        type=AlertMessage.class),
            @XmlElement(name="conversation", 
                        type=ConversationRequestMessage.class), 
            @XmlElement(name="simple",
            	type=SimpleMessage.class)
    })
	private T messageType;
	
	public T getMessageType() {
		return messageType;
	}
	public void setMessageType(T messageType) {
		this.messageType = messageType;
	}
		
	public MessageModel(T msg)
	{
		this.setMessageType(msg);
	}
	
	public MessageModel()
	{
		
	}
}

