/*
 *
 *  *
 *  *  * Copyright 2019-2020 the original author or authors.
 *  *  *
 *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  * you may not use this file except in compliance with the License.
 *  *  * You may obtain a copy of the License at
 *  *  *
 *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  * See the License for the specific language governing permissions and
 *  *  * limitations under the License.
 *  *
 *
 */

package org.springdoc.api.mixins;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.models.media.Schema;

/**
 * @author bnasslashen
 */
@JsonPropertyOrder(value = { "type", "format" }, alphabetic = true)
public interface SortedSchemaMixin {

	@JsonAnyGetter
	@JsonPropertyOrder(alphabetic = true)
	Map<String, Object> getExtensions();

	@JsonAnySetter
	void addExtension(String name, Object value);

	@JsonIgnore
	boolean getExampleSetFlag();

	@JsonInclude(JsonInclude.Include.CUSTOM)
	Object getExample();

	@JsonIgnore
	Map<String, Object> getJsonSchema();

	@JsonIgnore
	BigDecimal getExclusiveMinimumValue();

	@JsonIgnore
	BigDecimal getExclusiveMaximumValue();

	@JsonIgnore
	Map<String, Schema> getPatternProperties();

	@JsonIgnore
	Schema getContains();

	@JsonIgnore
	String get$id();

	@JsonIgnore
	String get$anchor();

	@JsonIgnore
	String get$schema();

	@JsonIgnore
	Set<String> getTypes();

	@JsonIgnore
	Object getJsonSchemaImpl();

}