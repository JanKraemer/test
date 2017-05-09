/*
 * Copyright (c) peter.braun@fhws.de
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
/* ***************************************************************************** 
  This file was generated as part of the GeMARA project by generator class:
  de.fhws.applab.gemara.dalston.generator.api.converter.ConverterGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.api.converter;

// ###(imports) You can edit below this line ### 
import com.owlike.genson.ext.jaxrs.GensonJaxRSFeature;
import com.owlike.genson.ext.jaxrs.GensonJsonConverter;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;

// ###(imports) You can edit above this line ### 
@Provider
@Consumes( { "application/vnd.fhws-user.default+json","application/vnd.fhws-session.default+json"} )
@Produces( { "application/vnd.fhws-user.default+json","application/vnd.fhws-session.default+json"} )
public class MyJsonConverter extends GensonJsonConverter
{
public MyJsonConverter( ) {}
public MyJsonConverter( @Context final Providers providers ) { super( providers );}
public MyJsonConverter(ContextResolver<GensonJaxRSFeature> gensonResolver ) { super( gensonResolver );}
}
