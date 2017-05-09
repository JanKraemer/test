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
  de.fhws.applab.gemara.dalston.generator.api.services.ServiceGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.api.services;

// ###(imports) You can edit below this line ### 
import javax.ws.rs.Path;
import io.swagger.annotations.Api;
import de.fhws.applab.gemara.norbury.core.api.services.AbstractService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import javax.ws.rs.core.Response;
import io.swagger.annotations.ApiParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.DefaultValue;
import org.glassfish.hk2.api.ServiceLocator;
import de.fhws.applab.gemara.norbury.core.database.dao.query.QueryStatement;
import de.fhws.applab.gemara.norbury.core.api.filter.PagingBehaviorUsingOffsetSize;
import javax.ws.rs.Consumes;
import javax.ws.rs.QueryParam;
import java.io.InputStream;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiImplicitParam;
import de.fhws.ifactory.api.models.*;
import de.fhws.ifactory.api.api.states.*;

// ###(imports) You can edit above this line ### 
@Path( "/users" )
public class UserService extends AbstractService
{
@GET
@Produces( "application/vnd.fhws-user.default+json" )
@ApiOperation( value = " ", notes = "No ApiKey is required. Authentication is not necessary.", tags = {"User"}, response = Void.class )

public Response GetAllUser ( @ApiParam( value="Position of first requested element" )@DefaultValue( "0" ) @QueryParam( "offset" ) int offset,@ApiParam( value="Count of maximum requested elements" )@DefaultValue( "1000" ) @QueryParam( "size" ) int size,@DefaultValue( "0" )@QueryParam( "day" )int day) {
GetAllUserState state = createAndConfigureState( GetAllUserState.class );de.fhws.ifactory.api.api.filter.FilterFilterByDay filter = serviceLocator.create( de.fhws.ifactory.api.api.filter.FilterFilterByDay.class ); serviceLocator.inject( filter );QueryStatement queryStatement = new QueryStatement( );queryStatement.setQuery( "" );queryStatement.addQueryParameter( "day", day);filter.setQueryStatement( queryStatement );PagingBehaviorUsingOffsetSize pagingBehavior = new PagingBehaviorUsingOffsetSize( offset,size);filter.setPagingBehavior( pagingBehavior );state.setQuery( filter );return state.build( );
}


@POST
@Consumes( "application/vnd.fhws-user.default+json" )
@ApiOperation( value = " ", notes = "No ApiKey is required. Authentication is not necessary.", tags = {"User"}, response = Void.class )

public Response createUser ( @ApiParam( value="Resource of type UserViewModel to be created" )UserViewModel user) {
CreateUserState state = createAndConfigureState( CreateUserState.class );state.setModelToCreate( user );return state.build( );
}


@GET
@Path( "{id: \\d+}" )
@Produces( "application/vnd.fhws-user.default+json" )
@ApiOperation( value = " ", notes = "No ApiKey is required. Authentication is not necessary.", tags = {"User"}, response = UserViewModel.class )
 @ApiResponses( value = { @ApiResponse( code = 200, message = "Response contains the requested user", response=Void.class ), @ApiResponse( code = 404, message = "The requested user does not exist" ),	@ApiResponse( code = 500, message = "Internal server error" ) } )
public Response getUser ( @ApiParam( value="Id of Resource of type user" )@PathParam( "id" ) long id) {
GetUserByIdState state = createAndConfigureState( GetUserByIdState .class );state.setModelId( id );return state.build( );
}


@DELETE
@Path( "{id: \\d+}" )
@Consumes( "application/vnd.fhws-user.default+json" )
@ApiOperation( value = " ", notes = "No ApiKey is required. Authentication is not necessary.", tags = {"User"}, response = Void.class )

public Response deleteUser ( @ApiParam( value="Id of resource of type User" ) @PathParam( "id" ) long id) {
DeleteUserState state = createAndConfigureState( DeleteUserState.class );state.setModelIdToDelete( id );return state.build( );
}


@PUT
@Path( "{id: \\d+}" )
@Consumes( "application/vnd.fhws-user.default+json" )
@ApiOperation( value = " ", notes = "No ApiKey is required. Authentication is not necessary.", tags = {"User"}, response = Void.class )

public Response updateUser ( @ApiParam( value="Id of resource to be modified" )@PathParam( "id" ) long id, @ApiParam( value="Resource of type UserViewModel to be modified" )UserViewModel user) {
UpdateUserState state = createAndConfigureState( UpdateUserState.class );user.setId( id );state.setModelToUpdate( user );return state.build( );
}


}
