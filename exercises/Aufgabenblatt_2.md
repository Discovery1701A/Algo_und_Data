# Aufgabenblatt 2 - Listenbasierte Datentypen

## Aufgabe 1: Stack
1. Schreiben Sie Unit-Tests, die das korrekte Verhalten eines gemäß dem unten definierten Interface implementierten [Stacks](../src/main/java/de/hs_el/streekmann/algodat/aufgabe2/Stack.java) zeigen.

     ```java
     public interface Stack<E> {
         boolean empty();
         E peek();
         E push(E item);
         E pop();
     }
     ```
2. Implementieren Sie das Interface unter Nutzung der [LinkedList](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/LinkedList.java) von Aufgabenblatt 1. Nutzen Sie dafür die vorbereitete Klasse [ListUsingStack](../src/main/java/de/hs_el/streekmann/algodat/aufgabe2/ListUsingStack.java).
3. Implementieren Sie das Interface nach dem Prinzip einer verlinkten Liste auf Basis einer privaten Node-Klasse. Nutzen Sie dafür die vorbereitete Klasse [LinkedStack](../src/main/java/de/hs_el/streekmann/algodat/aufgabe2/LinkedStack.java). Verwenden Sie zur Implementierung der Methoden keine Schleifen.
4. Welche Auswirkungen hat in den einzelnen Methoden bei beiden Implementierungen die Anzahl der Elemente in der Liste auf die Anzahl der Successor-Zugriffe?


## Aufgabe 2: Queue
1. Schreiben Sie Unit-Tests, die das korrekte Verhalten eines gemäß dem unten definierten Interface implementierten [Queue](../src/main/java/de/hs_el/streekmann/algodat/aufgabe2/Queue.java) zeigen.

     ```java
     public interface Queue<E> {
         boolean empty();
         E first();
         E enqueue(E item);
         E dequeue();
     }
     ```
2. Implementieren Sie das Interface unter Nutzung der [LinkedList](../src/main/java/de/hs_el/streekmann/algodat/aufgabe1/LinkedList.java) von Aufgabenblatt 1. Nut- zen Sie dafür die vorbereitete Klasse [ListUsingQueue](../src/main/java/de/hs_el/streekmann/algodat/aufgabe2/ListUsingStack.java).
3. Implementieren Sie das Interface nach dem Prinzip einer verlinkten Liste auf Basis einer privaten Node-Klasse. Nutzen Sie dafür die vorbereitete Klasse [LinkedQueue](../src/main/java/de/hs_el/streekmann/algodat/aufgabe2/LinkedQueue.java). Verwenden Sie zur Implementierung der Methoden keine Schleifen.
4. Welche Auswirkungen hat in den einzelnen Methoden bei beiden Implementierungen die Anzahl der Elemente in der Liste auf die Anzahl der Successor-Zugriffe?
