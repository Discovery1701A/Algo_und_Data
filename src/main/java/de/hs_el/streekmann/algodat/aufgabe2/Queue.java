package de.hs_el.streekmann.algodat.aufgabe2;

public interface Queue<E> {
	boolean empty();
	E first();
	E enqueue(E element);
	E dequeue();
}
