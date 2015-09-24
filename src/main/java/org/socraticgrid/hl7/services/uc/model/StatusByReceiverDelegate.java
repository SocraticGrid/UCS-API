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


/**
 * @author steven
 * Feb 7, 2014
 *
 */
public class StatusByReceiverDelegate {
	
	private String key;
	private AlertStatus alertStatus;
	private DeliveryAddress deliveryAddress;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public AlertStatus getAlertStatus() {
		return alertStatus;
	}
	public void setAlertStatus(AlertStatus alertStatus) {
		this.alertStatus = alertStatus;
	}
	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	@Override
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(o instanceof StatusByReceiverDelegate){
			return getKey().equals(((StatusByReceiverDelegate)o).getKey());
		}
		return false;
	}
	@Override
	public int hashCode() {
		return getKey().hashCode();
	}

	
}
