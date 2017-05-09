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
  de.fhws.applab.gemara.dalston.generator.database.MySqlPersistencyGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.database;

// ###(imports) You can edit below this line ### 
import javax.inject.Singleton;
import java.util.HashSet;
import java.util.Set;
import de.fhws.applab.gemara.norbury.core.database.AbstractMySqlPersistency;
import de.fhws.applab.gemara.norbury.core.database.config.MySqlConfig;
import de.fhws.applab.gemara.norbury.core.database.tables.AbstractTable;
import de.fhws.applab.gemara.norbury.utils.apikeys.database.tables.ApiKeyTable;
import de.fhws.ifactory.api.database.config.MySqlConfigDispatcher;

// ###(imports) You can edit above this line ### 
@Singleton
public class MySqlPersistency extends AbstractMySqlPersistency
{
public MySqlPersistency( ) {
super( new MySqlConfigDispatcher( ).getMySqlConfig( ) );
}
@Override public String getDatabaseName( )
{ return "Test"; } 
@Override protected Set<AbstractTable> getAllTables( ) {
Set<AbstractTable> returnValue = new HashSet<>( );
returnValue.add( new ApiKeyTable( ) );
return returnValue;
}
}
