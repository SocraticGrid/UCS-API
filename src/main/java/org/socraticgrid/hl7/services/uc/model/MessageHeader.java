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
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.jws.WebMethod;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:57 PM
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class MessageHeader implements Serializable {
	
	public MessageHeader(String messageId){
		this.messageHeaderId = messageId;
		this.messageId = messageId;
	}
	
	public MessageHeader()
	{
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlTransient
	private String messageHeaderId;
	
	/**
	 * Message Identifier issues by the UCS
	 */
	private String messageId;
	
	@XmlElement(required=true)
	private DeliveryAddress sender;
	
	// Joined from recipients
	@XmlElement(required=true)	
	private Set<Recipient> recipientsList = new HashSet<>();
	@XmlElement(required=true)
	private String subject;
	@XmlElement(required=false)
	private String relatedConversationId;
	
	@XmlElement(required=false)
	private Date created = new Date();
	@XmlElement(required=false)
	private Date lastModified = new Date();
	@XmlElement(required=false)
	private DeliveryGuarantee deliveryGuarantee=DeliveryGuarantee.BestEffort;
	@XmlElement(required=false)
	private List<DeliveryStatus> deliveryStatusList;
	@XmlElement(required=false)
	private MessageDynamics dynamics=MessageDynamics.Asynchronous;
	
	@XmlElement(required=false)
	private int priority=0;
	@XmlElement(required=false)
	private boolean receiptNotification=false;
	@XmlElement(required=false)
	private boolean retainFullyInLog=false;
	/**
	 * Time in seconds
	 */
	@XmlElement(required=false)
	private int timeout = 0;
	@XmlElement(required=false)
	private Properties properties;
	@XmlElement(required=false)
	private String relatedMessageId;
        
        /**********************************************/
        /*  Escalation and re-routing enhancements    */
        /**********************************************/
        
        @XmlElement(required=false)
        private List<Message> onFailureToReachAll;  //the guy didn't answer.
        
        @XmlElement(required=false)
        private List<Message> onFailureToReachAny;
        
        /**
         * Response timeout in minutes.
         */
        private int respondBy;
        
        @XmlElement(required=false)
        private List<Message> onNoResponseAll;
        
        @XmlElement(required=false)
        private List<Message> onNoResponseAny;


	public abstract MessageType getMessageType();

	/*
	 * The users Id of the Sender in UCS
	 */
	public DeliveryAddress getSender()
	{
		return sender;
	}

	public void setSender(DeliveryAddress sender)
	{
		this.sender = sender;
	}

	public Set<Recipient> getRecipientsList()
	{
		return recipientsList;
	}

	public void setRecipientsList(Set<Recipient> recipientsList)
	{
		this.recipientsList = recipientsList;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String getRelatedConversationId()
	{
		return relatedConversationId;
	}

	public void setRelatedConversationId(String relatedConversationId)
	{
		this.relatedConversationId = relatedConversationId;
	}

	public Date getCreated()
	{
		return created;
	}

	public void setCreated(Date created)
	{
		this.created = created;
	}

	public Date getLastModified()
	{
		return lastModified;
	}

	public void setLastModified(Date lastModified)
	{
		this.lastModified = lastModified;
	}

	public DeliveryGuarantee getDeliveryGuarantee()
	{
		return deliveryGuarantee;
	}

	public void setDeliveryGuarantee(DeliveryGuarantee deliveryGuarantee)
	{
		this.deliveryGuarantee = deliveryGuarantee;
	}

	public List<DeliveryStatus> getDeliveryStatusList()
	{
		return deliveryStatusList;
	}

	public void setDeliveryStatusList(List<DeliveryStatus> deliveryStatusList)
	{
		this.deliveryStatusList = deliveryStatusList;
	}

	public MessageDynamics getDynamics()
	{
		return dynamics;
	}

	public void setDynamics(MessageDynamics dynamics)
	{
		this.dynamics = dynamics;
	}

	public int getPriority()
	{
		return priority;
	}

	public void setPriority(int priority)
	{
		this.priority = priority;
	}

	public boolean isReceiptNotification()
	{
		return receiptNotification;
	}

	public void setReceiptNotification(boolean receiptNotification)
	{
		this.receiptNotification = receiptNotification;
	}

	public boolean isRetainFullyInLog()
	{
		return retainFullyInLog;
	}

	public void setRetainFullyInLog(boolean retainFullyInLog)
	{
		this.retainFullyInLog = retainFullyInLog;
	}

	public int getTimeout()
	{
		return timeout;
	}

	public void setTimeout(int timeout)
	{
		this.timeout = timeout;
	}

	public Properties getProperties()
	{
		return properties;
	}

	public void setProperties(Properties properties)
	{
		this.properties = properties;
	}

	@WebMethod(exclude=true)
	public String getRelatedMessageId()
	{
		return relatedMessageId;
	}
	@WebMethod(exclude=true)
	public void setRelatedMessageId(String relatedMessageId)
	{
		this.relatedMessageId = relatedMessageId;
	}
	@WebMethod(exclude=true)
	public String getMessageHeaderId() {
		return messageHeaderId;
	}
	/**
	 * The MessageHeaderId is set by the Message
	 * when the MessageId is set there --- Do we need this member
	 * - See Message.setMessageId(...)
	 * @return
	 */
	@WebMethod(exclude=true)
	public void setMessageHeaderId(String messageHeaderId) {
		this.messageHeaderId = messageHeaderId;
	}

	public String getMessageId()
	{
		return messageId;
	}
	public void setMessageId(String messageId)
	{
		this.messageId = messageId;
		this.messageHeaderId=messageId;
	}
        
        public List<Message> getOnFailureToReachAll() {
                return onFailureToReachAll;
        }

        public void setOnFailureToReachAll(List<Message> onFailureToReachAll) {
                this.onFailureToReachAll = onFailureToReachAll;
        }

        public List<Message> getOnFailureToReachAny() {
                return onFailureToReachAny;
        }

        public void setOnFailureToReachAny(List<Message> onFailureToReachAny) {
                this.onFailureToReachAny = onFailureToReachAny;
        }

        public int getRespondBy() {
                return respondBy;
        }

        public void setRespondBy(int respondBy) {
                this.respondBy = respondBy;
        }

        public List<Message> getOnNoResponseAll() {
                return onNoResponseAll;
        }

        public void setOnNoResponseAll(List<Message> onNoResponseAll) {
                this.onNoResponseAll = onNoResponseAll;
        }

        public List<Message> getOnNoResponseAny() {
                return onNoResponseAny;
        }

        public void setOnNoResponseAny(List<Message> onNoResponseAny) {
                this.onNoResponseAny = onNoResponseAny;
        }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((messageId == null) ? 0 : messageId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MessageHeader))
			return false;
		MessageHeader other = (MessageHeader) obj;
		if (messageId == null) {
			if (other.messageId != null)
				return false;
		} else if (!messageId.equals(other.messageId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MessageHeader [messageHeaderId=" + messageHeaderId
				+ ", messageId=" + messageId + ", sender=" + sender
				+ ", recipientsList=" + recipientsList + ", subject=" + subject
				+ ", relatedConversationId=" + relatedConversationId
				+ ", created=" + created + ", lastModified=" + lastModified
				+ ", deliveryGuarantee=" + deliveryGuarantee
				+ ", deliveryStatusList=" + deliveryStatusList + ", dynamics="
				+ dynamics + ", priority=" + priority
				+ ", receiptNotification=" + receiptNotification
				+ ", retainFullyInLog=" + retainFullyInLog + ", timeout="
				+ timeout + ", properties=" + properties
				+ ", relatedMessageId=" + relatedMessageId + "]";
	}



}