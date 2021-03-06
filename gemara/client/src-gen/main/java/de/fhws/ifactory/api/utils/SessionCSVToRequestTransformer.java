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
  de.fhws.applab.gemara.dalston.generator.csv.CSVTransformerGenerator
  DON'T EDIT THIS FILE. ALL MODIFICATIONS EXCEPT THOSE MARKED WILL BE OVERWRITTEN. 
***************************************************************************** */
package de.fhws.ifactory.api.utils;

// ###(imports) You can edit below this line ### 
import de.fhws.applab.gemara.shaklewell.csvimport.AbstractCSVToRequestTransformer;
import de.fhws.applab.gemara.norbury.core.doc.Link;
import org.apache.commons.csv.CSVRecord;
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import de.fhws.ifactory.api.client.*;

// ###(imports) You can edit above this line ### 
public class SessionCSVToRequestTransformer extends AbstractCSVToRequestTransformer<SessionViewModel>
{
	public SessionCSVToRequestTransformer() { super("/mensa/api/sessions",		  "application/vnd.fhws-session.default+json",       "null",       ',',       "UTF-8",       "yyyy-MM-dd HH:mm"); }
@Override protected void configureAuthentication(){super.noAuthentication();super.noApiKey();}
@Override protected SessionViewModel transformCSVRecordToModel(CSVRecord record){
// ###(csv_headers) You can edit below this line ###
final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(this.datePattern);formatter.withLocale(Locale.GERMANY);final SessionViewModel model = new SessionViewModel();
model.setId(Integer.parseInt(record.get("id")));model.setSecret(record.get("secret"));return model;
// ###(csv_headers) You can edit above this line ###
}
public static void main(String[] args){SessionCSVToRequestTransformer transformer = new SessionCSVToRequestTransformer();transformer.transform(args);}
}
