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
import java.util.List;

public class Status implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String capability;
	private boolean supported;
	private boolean available;
	private List<String> supportedBy;
	private String statusText;
	

	public Status()
	{
		// TODO Auto-generated constructor stub
	}


	public String getCapability()
	{
		return capability;
	}


	public void setCapability(String capability)
	{
		this.capability = capability;
	}


	public boolean isSupported()
	{
		return supported;
	}


	public void setSupported(boolean supported)
	{
		this.supported = supported;
	}


	public boolean isAvailable()
	{
		return available;
	}


	public void setAvailable(boolean available)
	{
		this.available = available;
	}


	public List<String> getSupportedBy()
	{
		return supportedBy;
	}


	public void setSupportedBy(List<String> supportedBy)
	{
		this.supportedBy = supportedBy;
	}


	public String getStatusText()
	{
		return statusText;
	}


	public void setStatusText(String statusText)
	{
		this.statusText = statusText;
	}

}
