# E-Ticketverwaltung Frontend

Willkommen zum E-Ticketverwaltung Frontend-Projekt! Dies ist das Frontend unserer innovativen Flugticket-Buchungsplattform, die als Schulprojekt entwickelt wurde. Wir haben eine benutzerfreundliche Anwendung erstellt, die es den Nutzern ermöglicht, schnell und einfach ihre Flugtickets zu buchen.

## Technologien

Dieses Projekt wurde mit den folgenden Technologien entwickelt:

- **HTML**: Strukturierung der Webseiten.
- **SCSS**: Erweiterte CSS-Funktionen für das Styling.
- **JavaScript**: Funktionale Programmierung und interaktive Features.
- **React.js**: JavaScript-Framework für den Aufbau der Benutzeroberfläche.
**Java**: Im Backend haben wir um die API-Calls zu machen Java benutzt.

## Zusätzliche Technologien

Zusätzlich zu den Haupttechnologien haben wir die folgenden Bibliotheken verwendet:

- **Bootstrap**: Für vorgefertigte UI-Komponenten und responsives Design.
- **Tailwind CSS**: Für ein Utility-First CSS-Framework und flexible Anpassungen.

## Erste Schritte

Folgen Sie diesen Schritten, um das Projekt lokal zu installieren und zu starten:

1. **Repository klonen**:
   ```bash
   git clonehttps://github.com/isaaclinsorg/biztrips.git
   cd biztrips
   ```

2. **Abhängigkeiten installieren**:
   ```bash
   npm install
   ```

3. **Entwicklungsserver starten**:
   ```bash
   npm start
   ```

Die Anwendung sollte nun unter `http://localhost:3000` verfügbar sein.

## Mitwirkende

- **Eris Jakupi**: [GitHub Profil](https://github.com/eri6081)
- **Isaac Lins**: [GitHub Profil](https://github.comisaaclinsorg)
- **Patrick Pilotti**: [GitHub Profil](https://github.com/patrick-pilotti)

## Lizenz

Dieses Projekt ist unter der MIT-Lizenz lizenziert. Weitere Details finden Sie in der [LICENSE](LICENSE)-Datei.

---

Vielen Dank, dass Sie unser E-Ticketverwaltung Schulprojekt nutzen! Wir hoffen, dass Ihnen unser Service gefällt.

Diese README.md-Datei bietet einen umfassenden Überblick über das E-Ticketverwaltung Frontend-Projekt, einschliesslich des Zwecks, der verwendeten Technologien, der Einrichtung und Ausführung des Projekts lokal, der Mitwirkenden und der Lizenzinformationen.


## Wöchentliche Reflexionen: 

### 17.05.2024: 

Heute haben wir gemeinsam im Team besprochen welche Aufgaben wer im Team übernehmen will und wird. Dabei sind mir zum Entschluss gekommen, dass es das beste wäre, wenn Isaac sich für das Backend kümmert, Eris das Frontend macht und Patrick das Deployment übernimmt und generell auch im Team all-around mithilft.

### 24.05.2024
Heute haben wir im Team erhebliche Fortschritte gemacht. Wir haben die Dateistruktur für unser Projekt festgelegt und implementiert. Isaac hat die Backend-Struktur entworfen und bereits einige grundlegende Funktionen implementiert.

Ich, Eris, habe die Navigation zwischen den verschiedenen Seiten der Anwendung eingerichtet und die entsprechenden Verlinkungen erstellt. Zusammen mit Isaac habe ich ausserdem die Endpoints definiert, die für die Kommunikation zwischen Frontend und Backend benötigt werden. Dabei haben wir die verschiedenen HTTP-Methoden (GET, POST, PUT, DELETE) und deren spezifische Endpunkte festgelegt, um sicherzustellen, dass die API-Anfragen effizient und klar strukturiert sind.

Patrick hat sich auf die Dokumentation der Deployment-Strategien konzentriert. Er hat die verschiedenen Arten von Deployments beschrieben, darunter Continuous Deployment (CD), Staging- und Produktionsumgebungen.

### 31.05.2024

Heute haben wir den Fehler vom letzten Mal erfolgreich behoben. Unser Backend konnte sich aufgrund fehlender Konfigurationen in Hibernate nicht mit der Datenbank verbinden. Nach gründlicher Analyse und Anpassung der Hibernate-Einstellungen konnten wir das Problem lösen und die Verbindung erfolgreich herstellen.

Patrick hat zudem einige Beispielprojekte auf fly.io deployed. Er hat den gesamten Prozess dokumentiert und dabei die verschiedenen Schritte und Herausforderungen hervorgehoben. Dank seiner Arbeit haben wir nun eine klare Anleitung für zukünftige Deployments auf dieser Plattform.

### 07.06.2024
Isaac hat heute mit einer mySQL-Datenbank die benötigten Backend-APIs erstellt und ins Repository gepusht. Jetzt können Patrick und ich, Eris, unsere Entwürfe mit dem Backend verbinden.

 Patrick und ich können nun die Pfade /wishlists und /trips mit den von Isaac erstellten Endpunkten verknüpfen. Dabei werden die REST-Services GET, POST, DELETE und PATCH implementiert.

Ich (Eris) hat heute begonnen, das Design für das Frontend zu entwerfen.

### 14.06.2024
Heute hat Isaac beschlossen, die Datenbankanbindung vom letzten Mal vorerst auf Eis zu legen. Stattdessen beschäftigt er sich damit, das Backend in mehrere Dateien aufzuteilen, was aufgrund der serverlosen Funktionen von fly.io eine Herausforderung darstellt. Dabei hatte er bereits Erfolg mit der Nutzung von JSON-Dateien.

Ich, Eris, arbeite weiterhin an den APIs und Endpunkten, um die Kommunikation zwischen Frontend und Backend zu optimieren.

Patrick informiert sich intensiv über die Erstellung des Dockerfiles und versucht, unsere Anwendung in zwei separate Images aufzuteilen, die er dann auf Docker Hub veröffentlichen möchte. Eris arbeitet weiterhin am Design und unterstützt Patrick bei der Einrichtung der Docker-Umgebung.

### 21.06.2024
Heute kamen wir insgesamt auch sehr gut voran, Isaac konnte die Endpunkte erfolgreich mir übergeben sodass ich diese mit dem Frontend verknüpfen kann. Leider trat immer wieder beim Verbinden von Backend zur Datenbank ein ärgerlicher Fehler auf denn mir mit Mühe wieder ausbügeln konnten.

### 28.06.2024
Heute hat sich Isaac dazu entschieden das Backend doch mit Javascript neu wieder zu realisieren, jedoch blieben die verschiedenen Endpoints erhalten. Patrick war es möglich heute unser Front- und Backend zu deployen dies konnte er auch ausführlich in der Dokumentation beschreiben.


### 05.07.2024

Heute ist unser letzter Tag vor der Abgabe. Wir konnten die letzten Änderungen vornehmen und einige Feinschliffe an unserem Projekt durchführen. Isaac hat die endgültige Datenbankanbindung erfolgreich integriert und die Backend-Architektur in mehrere Dateien aufgeteilt, um die Wartbarkeit zu verbessern.

Ich, Eris, habe die verbleibenden APIs und Endpunkte fertiggestellt. Patrick hat das Dockerfile erstellt und unsere Anwendung in zwei Images auf Docker Hub veröffentlicht, was den Deployment-Prozess erheblich erleichtert hat. Eris hat das Frontend-Design abgeschlossen und mit Patrick zusammen die Docker-Umgebung optimiert.

Dank unserer Zusammenarbeit und dem gezielten Einsatz unserer Fähigkeiten sind wir mit dem Projekt rechtzeitig fertig geworden und können es nun mit einem guten Gefühl abgeben.


## Sprint Review: 

Grundsätzlich verlief das Projekt reibungslos und ohne grössere Probleme. Wir hatten keinen Zeitdruck, was uns ermöglichte, die Aufgaben in Ruhe zu verteilen und anzupassen, auch wenn dies manchmal unvorhersehbar war. Wir haben jedoch flexibel reagiert und uns gut angepasst.

Der Product Owner ist sehr zufrieden mit dem Endprodukt. Besonders das Backend hat ihm gefallen. Er meinte sogar, dass der Entwickler des Backends eine Gehaltserhöhung verdient hätte. Aus einer objektiven Perspektive sollte jedoch berücksichtigt werden, dass das Backend keine Datenbank enthält. Dies lag jedoch an der unzureichenden Dokumentation von Vercel.

Auch zum Frontend hatte der Product Owner einige Anmerkungen. Er bemängelte, dass einige Buttons (Instagram, Facebook, Login) keine Verlinkung haben und dass eine scheinbar angebotene deutsche Version nicht zugänglich ist. Dies ist jedoch auf das begrenzte Budget des Kunden zurückzuführen.

### Was gut gelaufen ist:

-Reibungsloser Projektverlauf ohne Zeitdruck.
Flexibilität und Anpassungsfähigkeit des Teams.
Zufriedenheit des Product Owners mit dem Backend.

### Was schlecht gelaufen ist:

-Die ständigen Probleme mit der Datenbankanbindung beim Backend. Diese haben uns jedoch auch bei der Fehlerbehandlung als Softwareentwickler gestärkt.

-Wir hatten gegen Schluss ein wenig Zeitdruck, da wir nebst diesem Abschlussprojekt leider auch BM-Abschlussprüfungen hatten und Projekte/Prüfungen in den anderen Modulen auch nichts desto trotz haben wir unser bestes gegeben.

### Was wir daraus gelernt haben:

-Die Bedeutung einer guten Dokumentation und wie sie die Entwicklung beeinflussen kann.
Die Notwendigkeit, auch bei begrenztem Budget, eine vollständige und funktionale Benutzeroberfläche zu liefern.


