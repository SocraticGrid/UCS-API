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
package org.socraticgrid.hl7.services.uc.interfaces;
import java.util.List;

import org.socraticgrid.hl7.services.uc.model.AdapterMessage;
import org.socraticgrid.hl7.services.uc.model.InteractionTypes;

/**
 * Is a separate interface required for incoming messages?
 * @author Jerry Goodnough
 * @version 1.0
 * @updated 17-Dec-2013 1:48:20 PM
 */
public interface UCSAdapterIntf {


	/**
	 * 
	 * @param message    Message
	 */
	public boolean sendMessage(AdapterMessage message,String serverId);

	/**
	 * 
	 * @param newMessage    Message
	 * @param oldMessage TODO
	 */
	public boolean updateMessage(AdapterMessage newMessage, AdapterMessage oldMessage, String serverId);

	/**
	 * 
	 * @param message    Message
	 */
	public boolean cancelMessage(AdapterMessage message, String serverId);

	/**
	 * Used by UCS to map Address to Adapters
	 */
	public String getServiceId();

	public List<InteractionTypes> getInteractionTypes();

}