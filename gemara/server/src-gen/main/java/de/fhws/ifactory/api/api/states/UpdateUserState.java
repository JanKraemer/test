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
  de.fhws.applab.gemara.dalston.generator.api.states.primary.put.singleresource.PutPrimaryResourceStateGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.api.states;

// ###(imports) You can edit below this line ### 
import de.fhws.applab.gemara.norbury.core.api.security.Roles;
import de.fhws.applab.gemara.models.AbstractModel;
import de.fhws.applab.gemara.norbury.core.api.contraints.Constraint;
import de.fhws.applab.gemara.norbury.core.database.dao.results.NoContentDatabaseResult;
import javax.inject.Inject;
import de.fhws.ifactory.api.models.*;
import static de.fhws.applab.gemara.norbury.core.api.caching.CachingType.*;
import de.fhws.applab.gemara.norbury.core.api.states.put.AbstractPutState;
import de.fhws.ifactory.api.api.states.UpdateUserState;
import de.fhws.ifactory.api.models.User;
import de.fhws.applab.gemara.norbury.core.api.states.RelationTypes;
import de.fhws.applab.gemara.norbury.core.database.dao.results.SingleModelDatabaseResult;

// ###(imports) You can edit above this line ### 
public class UpdateUserState extends AbstractPutState<User,UserViewModel>
{
public UpdateUserState(){ super(); }
@Override protected void configureState( ) {
super.configureState();
		setViewConverter(UserViewModel.class );

}
@Override protected void defineTransitionLinks ( ) {
}
@Override protected NoContentDatabaseResult updateModelInDatabase( )
{
this.modelInDatabase.setLastModifiedAt( System.currentTimeMillis( ) );

// ###(updateModelInDatabase) You can edit below this line ### 
return null;

// ###(updateModelInDatabase) You can edit above this line ### 
}
@Override protected SingleModelDatabaseResult<User> loadModelFromDatabase( )
{

// ###(loadModelFromDatabase) You can edit below this line ### 
return null;

// ###(loadModelFromDatabase) You can edit above this line ### 
}
}
