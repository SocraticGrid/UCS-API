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
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 4:00:12 PM
 */
public enum DeliveryGuarantee {
	/**
	 * The message is by nature durable in that it must survive service interruption
	 * and generate exceptions on delivery failure.
	 */
	BestEffort,
	/**
	 * Delivery is attempted, but delivery failure is of no consequence. Disposable
	 * messages should not generate exceptions when deliverable fails. Disposable
	 * Messages need not be durable.
	 */
	Disposable,
	/**
	 * The Message is a higher priority form of Best effort.
	 * The is might also be modeled as a increased form of priority
	 */
	MaximumEffort
}