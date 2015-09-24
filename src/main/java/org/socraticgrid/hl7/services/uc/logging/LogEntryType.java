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
package org.socraticgrid.hl7.services.uc.logging;

public enum LogEntryType {
	User_AuthenticationSuccess,
	User_AuthenticationFailure,
	User_ExceptionUsingService,
	User_AcceptanceForDelivery,
	User_AdapterHandOff,
	User_FailedDelivery,
	User_SuccessfulDelivery,
	User_Reply,
	User_Response,
	User_ConversationReady,
	User_ConversationConnect,
	User_ConversationEnded,
	User_ConversationUpdate,
	User_Modification,
	User_Presence,
	User_QueryMessages,
	User_RetrieveMessage,
	User_SendMessage,
	User_PreferenceUpdate,
	User_CancelMessage,
	System_Startup,
	System_Shutdown,
	System_DirtyStartup,
	System_AdapterUp,
	System_AdapterDown,
	System_SuspendChannel,
	System_ResumeChannel,
	System_MessageDeliveryTimeout,
	System_MessageDeliveryRescheduled,
	System_MessageDeliverySuspended,
	System_InternalError,
	General,
	Diagnostic,
	Trace,
	Adapter_PostedException,
	Adapetr_Fault
}
