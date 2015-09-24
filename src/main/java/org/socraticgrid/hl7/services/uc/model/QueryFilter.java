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

public class QueryFilter implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String element;
	private String expression;
	/**
	 * @param element
	 * @param expression
	 */
	public QueryFilter(String element, String expression)
	{
		super();
		this.element = element;
		this.expression = expression;
	}
	public QueryFilter()
	{
		
	}
	public String getElement()
	{
		return element;
	}
	public void setElement(String element)
	{
		this.element = element;
	}
	public String getExpression()
	{
		return expression;
	}
	public void setExpression(String expression)
	{
		this.expression = expression;
	}
}
