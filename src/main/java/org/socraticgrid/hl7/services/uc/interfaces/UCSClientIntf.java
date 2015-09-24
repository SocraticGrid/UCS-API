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

import org.socraticgrid.hl7.services.uc.exceptions.BadBodyException;
import org.socraticgrid.hl7.services.uc.exceptions.FeatureNotSupportedException;
import org.socraticgrid.hl7.services.uc.exceptions.InvalidContentException;
import org.socraticgrid.hl7.services.uc.exceptions.InvalidMessageException;
import org.socraticgrid.hl7.services.uc.exceptions.MissingBodyTypeException;
import org.socraticgrid.hl7.services.uc.exceptions.ProcessingException;
import org.socraticgrid.hl7.services.uc.exceptions.ServiceAdapterFaultException;
import org.socraticgrid.hl7.services.uc.exceptions.UndeliverableMessageException;
import org.socraticgrid.hl7.services.uc.model.Conversation;
import org.socraticgrid.hl7.services.uc.model.DeliveryAddress;
import org.socraticgrid.hl7.services.uc.model.Message;
import org.socraticgrid.hl7.services.uc.model.MessageModel;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:57 PM
 */
public interface UCSClientIntf
{

	public boolean callReady(Conversation conversation, String callHandle, String serverId);

	public <T extends Message> boolean handleException(
			MessageModel<T> messageModel, DeliveryAddress sender, DeliveryAddress receiver, ProcessingException exp, String serverId);

	public <T extends Message> boolean handleNotification(
			MessageModel<T> messageModel, String serverId);

	public <T extends Message> MessageModel<T> handleResponse(
			MessageModel<T> messageModel, String serverId) throws InvalidMessageException,
			InvalidContentException, MissingBodyTypeException,
			BadBodyException, ServiceAdapterFaultException,
			UndeliverableMessageException, FeatureNotSupportedException;

	public <T extends Message> boolean receiveMessage(
			MessageModel<T> messageModel, String serverId);

}