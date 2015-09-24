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

import org.socraticgrid.hl7.services.uc.exceptions.FeatureNotSupportedException;
import org.socraticgrid.hl7.services.uc.exceptions.InvalidContentException;
import org.socraticgrid.hl7.services.uc.exceptions.InvalidConversationException;
import org.socraticgrid.hl7.services.uc.exceptions.InvalidMessageException;
import org.socraticgrid.hl7.services.uc.exceptions.InvalidQueryException;
import org.socraticgrid.hl7.services.uc.exceptions.ServiceAdapterFaultException;
import org.socraticgrid.hl7.services.uc.exceptions.UnknownServiceException;
import org.socraticgrid.hl7.services.uc.logging.LogEntry;
import org.socraticgrid.hl7.services.uc.model.Conversation;
import org.socraticgrid.hl7.services.uc.model.EventMetadata;
import org.socraticgrid.hl7.services.uc.model.EventType;
import org.socraticgrid.hl7.services.uc.model.Message;
import org.socraticgrid.hl7.services.uc.model.MessageModel;
import org.socraticgrid.hl7.services.uc.model.ServiceInfo;
import org.socraticgrid.hl7.services.uc.model.Status;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:56 PM
 */
public interface ManagementIntf
{

	public List<ServiceInfo> discoverChannels()
			throws FeatureNotSupportedException;


	public List<EventMetadata> getEventMetaData(EventType eventType,
			List<String> eventIds) throws InvalidMessageException,
			InvalidConversationException, FeatureNotSupportedException;

	public List<EventMetadata> queryEventMetaData(String query)
			throws InvalidQueryException, FeatureNotSupportedException;

	public List<Status> getStatus(String capablityType, List<String> capabilityIds)
			throws InvalidMessageException, InvalidContentException,
			InvalidConversationException, UnknownServiceException,
			ServiceAdapterFaultException, FeatureNotSupportedException;

	// Eqv. to GetContnent for Conversations
	public List<Conversation> getConversations(List<String> conversationIds) throws InvalidContentException, FeatureNotSupportedException;
	// Eqv. to GetContnent for Messages
	public <T extends Message> List<MessageModel<T>> getMessages(
			List<String> messageIds) throws InvalidMessageException;
	// Eqv. to GetContnent for System Events
	public List<LogEntry> getEvents(List<String> messageIds) throws InvalidMessageException, FeatureNotSupportedException;
	
	public boolean resumeChannel(List<String> channelIds)
			throws UnknownServiceException, ServiceAdapterFaultException,
			FeatureNotSupportedException;

	public boolean suspendChannel(List<String> channelIds)
			throws UnknownServiceException, ServiceAdapterFaultException,
			FeatureNotSupportedException;

}