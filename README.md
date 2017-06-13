
Probleme von SOAP

Den Vorteilen stehen allerdings einige Nachteile gegenüber. Die XML-Repräsentation der Dokumente macht die Dokumente groß und ein Parsen der Parameter und Ergebnisse auf beiden Seiten erforderlich. In Umgebungen, die eine performante Übertragung fordern – etwa bei der Kommunikation zwischen mobilem Endgerät und Server –, wird sich SOAP nicht so schnell durchsetzen. Des Weiteren ist auch die Sicherheit von SOAP-Verbindungen noch nicht hinreichend gelöst. Ein Client könnte sich mit einem Server verbinden und einen Aufruf starten, obwohl die Berechtigung fehlt. Sicherheitseigenschaften müssten erst auf der Serverseite implementiert werden. Die in Klartext übertragenen Nachrichten bilden ein weiteres Problem, das SSL jedoch verhindern kann.


13.3.1 Die technische Realisierung￼￼

Ein Clientprogramm besorgt sich, wie bei entfernten Programmen üblich, eine Referenz auf das entfernte Objekt. Das ist eine URL auf einen RPC-Router. Dieser Router wird mittels einer normalen HTTP-POST-Anfrage aktiviert. Er bekommt über den Client eine XML-kodierte Nachricht (der Content-Typ ist einfach text/html), in der die aufzurufende Methode und ihre Parameter kodiert sind. Der RPC-Router nimmt diese Nachricht entgegen, parst das empfangene XML-Dokument und leitet die Anfrage an die Methode weiter. Diese produziert die Ausgabe, die wiederum als XML-Dokument über die Antwort vom Server zum Client geschickt wird. Der Client nimmt das Ergebnis entgegen, und die Kommunikation ist beendet.

SOAP bietet für entfernte Methodenaufrufe einige Standarddatentypen an. Zu diesen gehören einfache Datentypen wie Ganzzahlen, Fließkommazahlen, Zeit- und Datumsangaben und Binärdaten. Außerdem unterstützt SOAP zusammengesetzte Datentypen wie Strukturen und Arrays. Wie diese Daten nun tatsächlich in eine XML-Nachricht umgesetzt werden, müssen wir glücklicherweise nicht wissen. Als Endanwender kommen wir mit der Nachricht nicht in Kontakt.
