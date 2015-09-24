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

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:55 PM
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AlertMessage extends Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required=true)
	private AlertMessageHeader alertMessageHeader;
	
	public AlertMessage(String messageId) {
		this.alertMessageHeader = new AlertMessageHeader(messageId);
	}
	
	public AlertMessage(AlertMessageHeader header) {
		this.alertMessageHeader = header;
	}
	
	public AlertMessage()
	{
		this.alertMessageHeader = new AlertMessageHeader();
	}

	@Override
	public AlertMessageHeader getHeader()
	{
		return alertMessageHeader;
	}

	@Override
	MessageType getMessageType() {
		return MessageType.Alert;
	}

}