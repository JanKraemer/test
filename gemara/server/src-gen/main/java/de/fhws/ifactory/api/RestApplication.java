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
  de.fhws.applab.gemara.dalston.generator.application.RestApplicationGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api;

// ###(imports) You can edit below this line ### 
import de.fhws.applab.gemara.norbury.core.AbstractRestApplication;
import javax.ws.rs.ApplicationPath;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.spi.ContainerLifecycleListener;
import org.glassfish.jersey.server.spi.Container;
import de.fhws.applab.gemara.norbury.core.database.IPersistency;
import java.util.HashSet;
import java.util.Set;
import io.swagger.jaxrs.config.BeanConfig;
import de.fhws.ifactory.api.api.services.*;
import de.fhws.ifactory.api.api.converter.*;

// ###(imports) You can edit above this line ### 
@ApplicationPath("/api")
public class RestApplication extends AbstractRestApplication
{
protected ServiceLocator serviceLocator;
public RestApplication( ){super( );register( new Binder( ) );
register( MyJsonConverter.class );
register( new ContainerLifecycleListener( ){	public void onStartup( Container container ){	serviceLocator = container.getApplicationHandler( ).getServiceLocator( );}public void onReload( Container container ){	/*...*/}public void onShutdown( Container container ){/*
* Shutdown database layer. This might be the normal IPersitency class or
* the Master-Slave Persistency.
*/IPersistency persistency = serviceLocator.getService( IPersistency.class );	persistency.shutdown( );}});}
@Override protected Set<Class<?>> getServiceClasses( ){Set<Class<?>> returnValue = new HashSet<>( );returnValue.add( StartStateService.class );returnValue.add( SessionService.class );returnValue.add( UserService.class );		return returnValue;}
@Override protected String getResourceFileName( ){	return "RestApplication.properties";}
protected void swaggerConfiguration( ) {
final BeanConfig beanConfig = new BeanConfig( );
beanConfig.setVersion( " 1.0.0" );
beanConfig.setSchemes( new String[] { "http" } );
beanConfig.setHost( "localhost:8080" );
beanConfig.setBasePath( "/mensa" );
beanConfig.setResourcePackage( "de.fhws.ifactory.api.api.services" );
beanConfig.setScan( true ); }
}
