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

import javax.jws.WebMethod;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:56 PM
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageBody implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlTransient
	private String messageBodyId;
	@XmlTransient
	private String messageId;
	@XmlElement(required=true)
	private String content;
	@XmlElement(required=false)
	private String tag;
	@XmlElement(required=true)
	private String type = "text/plain";

	

	public String getContent()
	{
		return content;
	}

	public String getTag()
	{
		return tag;
	}

	public String getType()
	{
		return type;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	@WebMethod(exclude = true)
	public String getMessageBodyId() {
		return messageBodyId;
	}
	@WebMethod(exclude = true)
	public void setMessageBodyId(String messageBodyId) {
		this.messageBodyId = messageBodyId;
	}
	@WebMethod(exclude = true)
	public String getMessageId() {
		return messageId;
	}
	@WebMethod(exclude = true)
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	@Override
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(o instanceof MessageBody){
			return getMessageBodyId().equals(((MessageBody)o).getMessageBodyId());
		}
		return false;
	}
	@Override
	public int hashCode() {
		return getMessageBodyId().hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MessageBody [content=" + content + ", tag=" + tag + ", type="
				+ type + "]";
	}

}