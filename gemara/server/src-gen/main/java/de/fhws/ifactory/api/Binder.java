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
  de.fhws.applab.gemara.dalston.generator.binder.BinderGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
 
/***
This class illustrates how to configure dependency injection with HK2 in Norbury.
*/
package de.fhws.ifactory.api;

// ###(imports) You can edit below this line ### 
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import de.fhws.ifactory.api.api.states.*;
import de.fhws.ifactory.api.database.dao.*;
import de.fhws.ifactory.api.database.config.*;
import de.fhws.ifactory.api.database.*;
import de.fhws.applab.gemara.norbury.core.database.dao.eager.EagerLoader;
import de.fhws.applab.gemara.norbury.core.database.dao.eager.EagerSaver;
import de.fhws.applab.gemara.norbury.core.database.dao.eager.EagerUpdate;
import de.fhws.applab.gemara.norbury.core.database.dao.eager.EagerDelete;
import de.fhws.applab.gemara.norbury.core.api.apikey.ApiKeyInfoProvider;
import javax.inject.Singleton;
import de.fhws.applab.gemara.norbury.core.database.IPersistency;
import de.fhws.applab.gemara.norbury.core.api.security.AuthenticationInfoProvider;
import de.fhws.applab.gemara.norbury.core.database.NoMySqlPersistency;
import de.fhws.applab.gemara.norbury.core.api.apikey.NoApiKeyProvider;

// ###(imports) You can edit above this line ### 
public class Binder extends AbstractBinder
{
@Override protected void configure( ){

// ###(AuthenticationInfoProvider) You can edit below this line ### 
bind( de.fhws.applab.gemara.norbury.core.api.security.NoAuthenticationProvider.class ).to( AuthenticationInfoProvider.class );

// ###(AuthenticationInfoProvider) You can edit above this line ### 

// ###(ApiKeyInfoProvider) You can edit below this line ### 
bind( NoApiKeyProvider.class ).to( ApiKeyInfoProvider.class );

// ###(ApiKeyInfoProvider) You can edit above this line ### 

// ###(EagerLoader) You can edit below this line ### 
bind( EagerLoader.class ).to( EagerLoader.class );

// ###(EagerLoader) You can edit above this line ### 

// ###(EagerSaver) You can edit below this line ### 
bind( EagerSaver.class ).to( EagerSaver.class );

// ###(EagerSaver) You can edit above this line ### 

// ###(EagerUpdate) You can edit below this line ### 
bind( EagerUpdate.class ).to( EagerUpdate.class );

// ###(EagerUpdate) You can edit above this line ### 

// ###(EagerDelete) You can edit below this line ### 
bind( EagerDelete.class ).to( EagerDelete.class );

// ###(EagerDelete) You can edit above this line ### 

// ###(IPersistency) You can edit below this line ### 
bind( MySqlPersistency.class ).to( IPersistency.class ).in( Singleton.class );

// ###(IPersistency) You can edit above this line ### 

// ###(StartStateState) You can edit below this line ### 
bind( StartStateState.class ).to( StartStateState.class );

// ###(StartStateState) You can edit above this line ### 

// ###(GetAllUserState) You can edit below this line ### 
bind( GetAllUserState.class ).to( GetAllUserState.class );

// ###(GetAllUserState) You can edit above this line ### 

// ###(UpdateUserState) You can edit below this line ### 
bind( UpdateUserState.class ).to( UpdateUserState.class );

// ###(UpdateUserState) You can edit above this line ### 

// ###(CreateUserState) You can edit below this line ### 
bind( CreateUserState.class ).to( CreateUserState.class );

// ###(CreateUserState) You can edit above this line ### 

// ###(DeleteUserState) You can edit below this line ### 
bind( DeleteUserState.class ).to( DeleteUserState.class );

// ###(DeleteUserState) You can edit above this line ### 

// ###(GetUserByIdState) You can edit below this line ### 
bind( GetUserByIdState.class ).to( GetUserByIdState.class );

// ###(GetUserByIdState) You can edit above this line ### 

// ###(GetSessionByIdState) You can edit below this line ### 
bind( GetSessionByIdState.class ).to( GetSessionByIdState.class );

// ###(GetSessionByIdState) You can edit above this line ### 

// ###(StartStateState) You can edit below this line ### 
bind( StartStateState.class ).to( StartStateState.class );

// ###(StartStateState) You can edit above this line ### 

// ###(DeleteSessionState) You can edit below this line ### 
bind( DeleteSessionState.class ).to( DeleteSessionState.class );

// ###(DeleteSessionState) You can edit above this line ### 

// ###(CreateSessionState) You can edit below this line ### 
bind( CreateSessionState.class ).to( CreateSessionState.class );

// ###(CreateSessionState) You can edit above this line ### 
}
}
