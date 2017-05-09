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
  de.fhws.applab.gemara.dalston.generator.models.resources.frontend.JavaModelForSingleClientResourceGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.client;

// ###(imports) You can edit below this line ### 
import de.fhws.applab.gemara.models.AbstractModel;
import de.fhws.applab.gemara.shaklewell.DateTimeConverter;
import com.owlike.genson.annotation.JsonConverter;
import com.owlike.genson.annotation.JsonProperty;
import com.owlike.genson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import de.fhws.applab.gemara.shaklewell.Link;
import de.fhws.applab.gemara.shaklewell.ClientLinkConverter;
import java.util.List;

// ###(imports) You can edit above this line ### 
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

private Link userUrl;
@JsonConverter( ClientLinkConverter.class )
public Link getUserUrl() {
return this.userUrl;
}
@JsonConverter( ClientLinkConverter.class )
public void setUserUrl( Link userUrl) {

this.userUrl = userUrl;
}
private Link selfUri;
@JsonConverter( ClientLinkConverter.class ) @JsonProperty( "self" ) public Link getSelfUri( ) { return selfUri; }
@JsonConverter( ClientLinkConverter.class )  @JsonProperty( "self" ) public void setSelfUri( Link link ) { this.selfUri = link; }
}
