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
  de.fhws.applab.gemara.dalston.generator.api.services.DispatcherServiceGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.api.services;

// ###(imports) You can edit below this line ### 
import javax.ws.rs.Path;
import io.swagger.annotations.Api;
import de.fhws.applab.gemara.norbury.core.api.services.AbstractService;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import javax.ws.rs.core.Response;
import de.fhws.ifactory.api.api.states.*;

// ###(imports) You can edit above this line ### 
@Api( value="/" )@Path( "/" )
public class StartStateService extends AbstractService
{
@GET@Produces( MediaType.APPLICATION_JSON )public Response getBase( ){	StartStateState state = createAndConfigureState( StartStateState.class );	return state.build( );}
}
