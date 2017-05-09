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

package de.fhws.applab.gemara.template;

import de.fhws.applab.gemara.ratcliff.impl.RestApi;

/**
 * Created by braunpet on 17.05.16.
 */
public class Template
{
	public static final String CONTEXT_PATH = "mensa";

	public static void main( final String[] args )
	{
		// @formatter:off
		RestApi.create( )
			   .producer( "fhws" )
			   .projectName( "i-factory" )
			   .contextPath( CONTEXT_PATH )
			   .generateInPackageWithPrefix( "de.fhws.ifactory.api" )
			   .noApiKey()
			   .usingDatabase("Test")
				.atHost("localhost")
				.usingUsername("root")
				.andPassword("root")
				.done()
			   .resources( "Session", "User" )
					.defineVirtualResourceWithName( "Session" )
						.withSimpleAttribute( "id" ).asInt()
						.withSimpleAttribute("secret").asString()
			   			.withSubResourceNamed( "user" ).toResource( "User" ).withDefaultView()
			   			.allAttributesDefined()
						.andCachingByValidatingEtags()
			   		.defineVirtualResourceWithName( "User" )
			   			.withSimpleAttribute( "id" ).asInt()
			   			.withSimpleAttribute( "isGuest" ).asInt()
			   			.withSimpleAttribute( "firstName" ).asString()
			   			.withSimpleAttribute( "lastName" ).asString()
			   			.withSimpleAttribute( "email" ).asString()
			   			.withSimpleAttribute( "role" ).asInt()
			   			.allAttributesDefined()
			   			.andCachingByValidatingEtags()
			   		.allResourcesDefined()
			   .states()
			   		.dispatcherState()
			   			.named( "StartState" ).makeApiKeyMandatory().grantToEverybody().done()
					.primaryGetSingle()
			   			.named( "GetSessionById" )
			   			.withResource( "Session" )
			   			.done()
					.primaryPost()
						.named("CreateSession")
						.withResource("Session")
						.done()
					.primaryDelete()
						.named("DeleteSession")
						.withResource("SessionId")
						.done()
					.primaryPost()
						.named("CreateUser")
						.withResource("User")
						.done()
					.primaryPut()
						.named("UpdateUser")
						.withResource("User")
						.done()
					.primaryDelete()
						.named("DeleteUser")
						.withResource("User")
						.done()
					.primaryGetSingle()
						.named("GetUserById")
						.withResource("UserId")
						.done()
			   		.primaryGetCollection()
			   			.named("GetAllUser")
			   			.withResource( "User" )
			   			.withQuery()
			   				.name( "FilterByDay" )
			   				.path( "" )
			   				.queryTemplate( "" )
			   				.queryParameters()
			   					.named( "day" ).withDefaultValue( "0" ).asInt().doneWithQuery()
			   				.offsetSize()
			   					.offsetParameterIsNamed( "offset" ).withDefaultValue( 0 )
			   					.sizeParameterIsNamed( "size" ).withDefaultValue( 1000 )
					.allStatesDefined()
			   .transitions()
					.fromState( "StartState" )
			   			.asHeaderLink().toState( "GetAllMensen" )
			   			.usingRelationType( "getAllMensen" )
			   		.fromState( "GetAllMensen" )
			   			.asContentLink().toState( "GetMensaById")
			   		.fromState( "GetMensaById" ).asContentLink().toState( "GetMealsOfMensa" )
			   		.fromState( "GetMensaById" )
			   			.asHeaderLink().toState( "GetMealsOfMensa" ).usingRelationType( "meals" )
			   		.fromState( "GetMealsOfMensa" )
			   			.asHeaderLink().toState( "GetMealsOfMensa" ).usingRelationType( "otherdays" )
			   		.allTransitionsDefined()
			   .noAuthentication( )
			   .generate();
		// @formatter:on
	}
}
