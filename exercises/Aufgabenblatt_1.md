# Aufgabenblatt 1 - Listen

## Aufgabe 1: Arbeitsumgebung
- Stellen Sie sicher, dass Sie ein aktuelles JDK und eine Java-IDE (z.B. IntelliJ, Eclipse, ...) installiert haben.
- Verschaffen Sie sich aus Ihren Arbeitsumgebungen, im PC-Pool und zu Hause, unmittelbaren Zugriff auf das Java-API zu 
der von Ihnen installierten SDK-Version (z.B 
[https://docs.oracle.com/en/java/javase/18/docs/api/java.base/module-summary.html](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/module-summary.html) 
für die Basis-Funktionalität von Java 18) und weitere Quellen zu Java, siehe z.B. Literatur zur Veranstaltung Java 2 
im Modulhandbuch.
- Erstellen Sie einen Fork des [Git-Repositories](https://gitlab.technik-emden.de/streekmann/algodat-praktikum-22-23) (siehe [Anleitung im Moodle](https://moodle.hs-emden-leer.de/moodle/mod/resource/view.php?id=221439))

## Aufgabe 2: Listenimplementierung
Erarbeiten Sie sich die Details der Implementierung, der zu dieser Aufgabe hinterlegten 
[Java-Dateien](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1). Für die Ausführung der Unit-Tests benötigen Sie 
JUnit 5.

1. Verändern Sie die Implementierung der [LinkedList](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/LinkedList.java) 
   so, dass diese ein zusätzliches leeres Element am Anfang der Liste enthält, das selbst in der leeren Liste vorhanden ist. 
   Die Implementierung muss die Tests in den Klassen 
   [IteratorTests](../src/test/java/de/hs_el/streekmann/algodat/aufgabe1/IteratorTests.java) und 
   [ListTests](../src/test/java/de/hs_el/streekmann/algodat/aufgabe1/ListTests.java) erfüllen.

2. Übernehmen Sie die folgenden Funktionen gemäß der Spezifikation in der 
   [API-Dokumentation zu java.util.List](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/List.html) 
   in das Interface List und implementieren Sie sie in der Klasse 
   [LinkedList](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/LinkedList.java). Berücksichtigen Sie den Typparameter E!
   
   - ```E remove(int index)```
   - ```boolean remove(Object o)```
   - ```int indexOf(Object o)```
    
Die Implementierung muss jetzt auch die Tests in den Klassen 
[ExtendedEmptyListTests](../src/test/java/de/hs_el/streekmann/algodat/aufgabe1/ExtendedEmptyListTests.java) und 
[ExtendedFilledListTests](../src/test/java/de/hs_el/streekmann/algodat/aufgabe1/ExtendedFilledListTests.java) erfüllen.

**Nicht testatpflichtig:**

1. Erweitern Sie Klasse [Main](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/Main.java) derart, dass die 
   erweiterte Funktionalität geeignet demonstriert wird. Testen Sie auf jeden Fall, das Löschen des ersten und des letzten 
   Listenelements.
2. Verändern Sie die Implementierung der 
   [LinkedList](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/LinkedList.java) so, dass diese eine Ringliste 
   darstellt, also das letzte Element wieder auf das erste Element zeigt.

## Aufgabe 3: Messung der Listenimplementierungen

1. Bestimmen Sie die Anzahl der Zugriffe auf nachfolgende Listenelemente (Successor) durch den Befehl 
   ```nodeAtCurrentIndex.successor``` in der Methode get der 
   [LinkedList](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/LinkedList.java) bei Durchlaufen der Ausgabeschleife 
   in der Methode ```printListInForLoop``` für die ```linkedList``` in der Klasse 
   [Main](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/Main.java) bei Listenlänge ```numberOfElements```.
2. Bestimmen Sie die Anzahl der Zugriffe auf nachfolgende Listenelemente (Successor) durch den Befehl 
   ```nextNode.successor``` in der Methode ```next``` des Iterators bei Durchlaufen der Ausgabeschleife in der Methode 
   ```printListInForLoopWithIterator``` bzw. ```printListInForeachLoop``` für die ```linkedList``` in der Klasse 
   [Main](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/Main.java) bei Listenlänge ```numberOfElements```.
3. Führen Sie die Bestimmung der Aufgabenteile 1 und 2 äquivalent (Zugriffe auf ein Element im Array) mit der 
   ```arrayList``` durch und vergleichen Sie die erforderlichen Zugriffe.
4. Welche Konsequenzen ziehen Sie aus den Messungen für die Verwendung von Iteratoren?
