# GeMARA Template für eigene Projekte


Dieses Repository kann als Vorlage für eigene Projekte benutzt werden, die auf GeMARA basieren.

## Verzeichnisübersicht

* `src/main/java` In diesem Verzeichnis liegt die GeMARA Model-Datei in einem passenden Package.
* `gemara` Das Zielverzeichnis für den generierten Quellcode. Dieses Verzeichnis ist zu Beginn nicht vorhanden oder leer und wird
bei der ersten Code-Generierung angelegt.
* `pom.xml` Eine Vorlage für eine Maven POM Datei, mit der ein GeMARA Model übersetzt und auf einem Tomcat Container gestartet werden kann.

## Beispiel für eine GeMARA Model-Datei


```java
package de.fhws.gemara.demo;

public class MyModel
{
    public static void main( final String[] args )
    {
        RestApi.create( )
            .producer( "fhws" )
            .projectName( "mensa" )
            .contextPath( "restaurants" )
            .generateInPackageWithPrefix( "de.fhws.mensa.api" )
            .noApiKey()
            // ...
```

## Starten der Code-Generierung

Der Name der Model-Klasse muss in der `pom.xml` im Wurzelverzeichnis des Projektes geändert werden.
Im oberen Bereich der `pom.xml` wird eine Property `gemara.model.file` mit dem Pfad (!) zur Model-Klasse
relativ zum Verzeichnis `src/main/java` definiert.

Zum Beispiel:

```xml
<gemara.model.file>de/fhws/gemara/demo/MyModel</gemara.model.file>
```

Für den Start des Generierungsvorgangs gibt es zwei Möglichkeiten:

* `mvn process-sources`
* In der IDE die `main` Methode der Model-Klasse starten

Nach der Code-Generierung befindet sich der generierte Quellcode
im Verzeichnis `gemara` und dort in den Unterverzeichnissen `client` für
die POJO Klassen für Java-basierte Clients sowie im Unterverzeichnis `server` für
den Server-Code. Jedes Unterverzeichnis ist als eigenes Projekt mit eigener `pom.xml`
Datei aufgebaut. Es gibt eine Parent-POM im Verzeichnis `gemara`, die diese beiden Projekte
als Module enthält.

## Deploy der Server-Komponente auf einen Tomcat Container

Die `pom.xml` im Verzeichnis `gemara/server` wird für das Starten
der Server-Komponente auf einem Tomcat Container verwendet. Diese Datei wird
mit einem Standard-Profil generiert, das für ein Starten auf einem Tomcat Container
auf `localhost` verwendet werden kann.

Für das Starten auf einem anderen Tomcat Container kann man jetzt ein
weiteres Profil definieren. Dafür enthält die Datei Kommentarzeilen mit
Markierungen, wie in folgendem Beispiel:

```xml
<!-- ###(profiles) You can edit below this line ### -->
<!-- ###(profiles) You can edit above this line ### -->
```

Zwischen diese beiden Kommentarzeilen kann nun manuell Text hinzugefügt werden,
der bei einer erneuten Code-Generierung nicht überschrieben wird. Einen neuen
Tomcat Container könnte man zum Beispiel wie folgt definieren:

```xml
<!-- ###(profiles) You can edit below this line ### -->
<profile>
    <id>tomcat-remote-profile</id>
    <properties>
        <tomcat-server>tomcat-remote-host</tomcat-server>
        <tomcat-url>http://example.org:8080/manager/text</tomcat-url>
    </properties>
</profile>
<!-- ###(profiles) You can edit above this line ### -->
```

Der Wert für `id` wird später beim Starten von Maven für die Auswahl des Profiles benötigt.
Der Wert für `tomcat-server` dient der Referenzierung auf zusätzliche
Angaben zur Konfiguration in der Datei `settings.xml`.
Für das Deployment auf einem Tomcat Container wird üblicherweise eine Zugriffsberechtigung
in Form eines Nutzernames und eines Passwortes verlangt. Diese vertraulichen Daten
sollten nicht in dieser `pom.xml` hinterlegt werden, sondern in der
`settings.xml` Datei für Maven im Verzeichnis `$HOME/.m2/`.

```xml
<settings>
    <servers>
        <server>
            <id>tomcat-remote-host</id>
            <username>your name</username>
            <password>your password</password>
        </server>
    </servers>
</settings>
```

Die hier verwendete `id` entspricht dem Wert von `tomcat-server` aus
der `pom.xml`. Eine Vorlage für eine solche `settings.xml` wird ebenfalls in
`gemara/server` generiert und muss dann lediglich mit den richtigen Daten
gefüllt und in das Verzeichnis `$HOME/.m2` kopiert bzw. mit der dort
schon vorhandenen Datei verbunden werden.

Jetzt kann die Server-Komponenten auf dem Tomcat Container
 gestartet werden. Wechseln Sie in das Verzeichnis `gemara/server` und starten Maven
 mit `mvn -P tomcat-remote-profile tomcat:redeploy`. Alternativ kann man auch
 im Wurzelverzeichnis des Projektes das Kommando `mvn verify` starten. Damit wird der
 Code-Generator gestartet und anschließend die Server-Komponente auf einem Tomcat Container
 gestartet. Dieses Vorgehen eignet sich besonders bei solchen Systemen, bei denen keine manuellen
 Änderungen oder Ergänzungen notwendig sind.

## Manuelle Änderungen am generierten Quellcode

In vielen Fällen wird der Code-Generator vollständigen und sofort
übersetzbaren Quelltext in Java für die Server-Komponente erzeugen.
In folgenden Fällen ist aber eine manuelle Ergänzung des Quelltextes
notwendig:

* Wenn virtuelle Ressourcen verwenden werden, also Ressourcen, für die keine
Datenbankverbindung generiert wurde, zum Beispiel weil die Daten aus anderen Quellen stammen. In diesem Fall
muss die Bereitstellung der Daten manuell hinzugefügt werden.
* Wenn das Standardverhalten bei der Verarbeitung von Anfragen erweitert werden muss, zum
Beispiel, weil während der Verarbeitung andere Dritt-Systeme informiert werden müssen oder E-Mails verschickt werden müssen.
Hierfür kann entweder der generierte Quelltext erweitert werden oder es werden sog.
Hook-Klassen verwendet.

Einige generelle Hinweise für die manuelle Veränderung von generiertem Quellcode:

* Eigene Klassen, die in das Verzeichnis `src-gen` hinzugefügt werden, werden durch den Generator niemals überschrieben oder gelöscht.
* Veränderungen an generierten Klassen werden durch den Generator überschrieben, außer
die Veränderungen in den den durch spezielle Kommentarzeilen markierten Bereichen.
* Es sollte vermieden werden, komplette Verzeichnisse in `src-gen` manuell über die IDE oder
 über die Kommandozeile zu löschen. Beim Löschen einzelner Dateien ist darauf zu achten, dass
 damit manuelle Änderungen natürlich verloren gehen. Das Löschen von generierten Klassen
 ohne manuelle Änderungen ist unproblematisch. Bei der nächsten Code-Generierung werden die Klassen
 wieder hergestellt.

Einige Hinweise für den Umgang mit generierten Quelltext und Repository-Systemen:

* Vollständig generierter Quelltext ohne manuelle Änderungen muss nicht in das Repository
eingecheckt werden.
* Wenn der generierte Quelltext manuell verändert oder ergänzt wurde, muss der
generierte Quelltext vollständig in das Repository eingecheckt werden.

Bevor man beginnt, den generierten Quelltext zu veärndert, sollte man in seiner Entwicklungsumgebung
das Verzeichnis mit den generierten Quelltext zum Projekt hinzufügen.
Unter IntelliJ kann man zum Beispiel das Verzeichnis `gemara/server/src-gen/main/java` mit einem
Rechts-Klick auf `java` und dem Menüpunkt *Mark Directory As* und dem Unterpunkt *Mark As Generated Sources Root*
entsprechend kennzeichnen. Damit können nun alle Klassen verwendet werden, die über die Abhängigkeiten
in der `pom.xml` im Wurzelverzeichnis verfügbar gemacht wurden. Bitte beachten, dass diese
Abhängigkeiten aber auch in der `pom.xml` des Server-Projektes, also in der Datei
`gemara/server/pom.xml` hinzugefügt werden müssen, damit sie später beim Deploy auf Tomcat mit Maven auch
verfügbar sind.






