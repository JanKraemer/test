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
  de.fhws.applab.gemara.dalston.generator.database.config.MySqlConfigDispatcherGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.database.config;

// ###(imports) You can edit below this line ### 
import de.fhws.applab.gemara.norbury.core.database.config.MySqlConfig;
import de.fhws.applab.gemara.norbury.core.database.config.DefaultMySqlConfigDispatcher;

// ###(imports) You can edit above this line ### 
public class MySqlConfigDispatcher extends DefaultMySqlConfigDispatcher
{
@Override protected void addConfiguration( ) {
addDefaultConfiguration( new MySqlConfig( "localhost","root","root") );
}
}
