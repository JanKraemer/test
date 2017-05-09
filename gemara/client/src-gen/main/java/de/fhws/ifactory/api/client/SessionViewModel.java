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
  de.fhws.applab.gemara.dalston.generator.models.views.frontend.ResourceViewGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.client;

// ###(imports) You can edit below this line ### 
import de.fhws.applab.gemara.models.ViewModel;
import java.time.LocalDateTime;
import com.owlike.genson.annotation.JsonConverter;
import com.owlike.genson.annotation.JsonProperty;
import com.owlike.genson.annotation.JsonIgnore;
import de.fhws.applab.gemara.shaklewell.Link;
import de.fhws.applab.gemara.shaklewell.ClientLinkConverter;
import de.fhws.applab.gemara.shaklewell.DateTimeConverter;
import java.util.List;
import de.fhws.applab.gemara.shaklewell.IgnoreThisField;

// ###(imports) You can edit above this line ### 
public class SessionViewModel extends ViewModel<Session>
{
	public SessionViewModel( )	{		theModel = new Session( );	}	public SessionViewModel ( Session theModel )	{		super( theModel );	}

public int getId() {
return theModel.getId();
}

public void setId( int id) {
theModel.setId( id);
}

public String getSecret() {
return theModel.getSecret();
}

public void setSecret( String secret) {
theModel.setSecret( secret);
}
@JsonConverter( ClientLinkConverter.class )
public Link getUserUrl() {
return theModel.getUserUrl();
}
@JsonConverter( ClientLinkConverter.class )
public void setUserUrl( Link userUrl) {
theModel.setUserUrl( userUrl);
}
 @Override public String toString( ){		return theModel.toString( );}
@JsonConverter(ClientLinkConverter.class) @JsonProperty( "self" ) public Link getSelfUri( ) { return theModel.getSelfUri(); }
@JsonConverter(ClientLinkConverter.class) @JsonProperty( "self" )  public void setSelfUri( Link link ) { theModel.setSelfUri( link ); }
}
