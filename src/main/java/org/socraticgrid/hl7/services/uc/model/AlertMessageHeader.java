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
import java.util.LinkedHashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:55 PM
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AlertMessageHeader extends MessageHeader implements Serializable {

	AlertMessageHeader(String messageId){
		super(messageId);
	}
	
	public AlertMessageHeader()
	{
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(required=false)
	private AlertStatus alertStatus=AlertStatus.New;
	
	@XmlElement(required=false)
	private String serviceResponseAddress;

	@XmlElement(required=false)
	private LinkedHashMap<DeliveryAddress,AlertStatus> statusByReciever = new LinkedHashMap<>();

	public AlertStatus getAlertStatus()
	{
		return alertStatus;
	}

	public LinkedHashMap<DeliveryAddress, AlertStatus> getStatusByReciever()
	{
		return statusByReciever;
	}

	public void setAlertStatus(AlertStatus alertStatus)
	{
		this.alertStatus = alertStatus;
	}
	
	public void setServiceResponseAddress(String serviceResponseAddress)
	{
		this.serviceResponseAddress = serviceResponseAddress;
	}
	public String getServiceResponseAddress() {
		return serviceResponseAddress;
	}

	public void setStatusByReciever(LinkedHashMap<DeliveryAddress, AlertStatus> statusByReciever)
	{
		this.statusByReciever = statusByReciever;
	}


	@Override
	public MessageType getMessageType() {
		return MessageType.Alert;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlertMessageHeader [alertStatus=" + alertStatus
				+ ", serviceResponseAddress=" + serviceResponseAddress
				+ ", statusByReciever=" + statusByReciever + ", toString()="
				+ super.toString() + "]";
	}

}