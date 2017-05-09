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
  de.fhws.applab.gemara.dalston.generator.models.resources.backend.JavaModelForSingleResourceGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.models;

// ###(imports) You can edit below this line ### 
import de.fhws.applab.gemara.models.AbstractModel;
import de.fhws.applab.gemara.norbury.core.api.converters.DateTimeConverter;
import com.owlike.genson.annotation.JsonConverter;
import com.owlike.genson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import de.fhws.applab.gemara.norbury.core.database.annotations.EmbeddedResource;
import org.glassfish.jersey.linking.Binding;
import org.glassfish.jersey.linking.InjectLink;
import de.fhws.applab.gemara.norbury.core.api.converters.LinkConverter;
import javax.xml.bind.annotation.XmlRootElement;
import javax.ws.rs.core.Link;
import java.util.List;
import java.util.stream.Collectors;

// ###(imports) You can edit above this line ### 

@XmlRootElement
public class Session extends AbstractModel
{

private int id;

public int getId() {

return this.id;
}

public void setId( int id) {

this.id = id;
}

private String secret;

public String getSecret() {

return this.secret;
}

public void setSecret( String secret) {

this.secret = secret;
}
@InjectLink( style = InjectLink.Style.ABSOLUTE, value = "sessions/${instance.id}/users", type = "application/vnd.fhws-user.default+json",rel = "userUrl" )
private Link userUrl;
@JsonConverter( LinkConverter.class )
public Link getUserUrl() {

return this.userUrl;
}
@JsonIgnore
public void setUserUrl( Link userUrl) {

this.userUrl = userUrl;
}
@JsonIgnore @JsonConverter( LinkConverter.class ) public Link getSelfUri( ) { return null; }
@JsonIgnore public void setSelfUri( Link link ) { }
}
