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
  de.fhws.applab.gemara.dalston.generator.models.views.backend.ResourceViewGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.models;

// ###(imports) You can edit below this line ### 
import de.fhws.applab.gemara.models.ViewModel;
import java.time.LocalDateTime;
import com.owlike.genson.annotation.JsonConverter;
import com.owlike.genson.annotation.JsonIgnore;
import de.fhws.applab.gemara.norbury.core.api.converters.LinkConverter;
import javax.ws.rs.core.Link;
import de.fhws.applab.gemara.norbury.core.api.converters.DateTimeConverter;
import org.glassfish.jersey.linking.InjectLink;
import de.fhws.applab.gemara.norbury.core.database.annotations.EmbeddedResource;
import de.fhws.applab.gemara.norbury.core.api.converters.IgnoreThisField;
import java.util.List;
import java.util.stream.Collectors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

// ###(imports) You can edit above this line ### 
@ApiModel( value="View  of Session Resource", description="This view is a default view" )
public class SessionViewModel extends ViewModel<Session>
{
	public SessionViewModel( )	{		theModel = new Session( );	}	public SessionViewModel ( Session theModel )	{		super( theModel );	}
@ApiModelProperty(value="", hidden=false)
public int getId() {
return theModel.getId();
}

public void setId( int id) {
theModel.setId( id);
}
@ApiModelProperty(value="", hidden=false)
public String getSecret() {
return theModel.getSecret();
}

public void setSecret( String secret) {
theModel.setSecret( secret);
}
@ApiModelProperty(dataType="de.fhws.applab.gemara.norbury.core.doc.Link", value="", hidden=false)@JsonConverter( LinkConverter.class )
public Link getUserUrl() {
return theModel.getUserUrl();
}
@JsonIgnore
public void setUserUrl( Link userUrl) {
theModel.setUserUrl( userUrl);
}
 @Override public String toString( ){		return theModel.toString( );}
@InjectLink( style = InjectLink.Style.ABSOLUTE, value = "sessions/${instance.id}", type = "application/vnd.fhws-session.default+json",rel = "self" )
private Link selfUri;
@ApiModelProperty( dataType="de.fhws.applab.gemara.norbury.core.doc.Link", hidden=false) @JsonConverter( LinkConverter.class ) public Link getSelfUri( ) { return selfUri; }
@JsonIgnore public void setSelfUri( Link link ) { this.selfUri = link; }
@ApiModelProperty(hidden=true) @JsonIgnore
public Session getTheModel( ){	return this.theModel;}
@ApiModelProperty(hidden=true)@JsonIgnore@Override public long getLastModifiedAt( ){	return this.theModel.getLastModifiedAt( );}
}
