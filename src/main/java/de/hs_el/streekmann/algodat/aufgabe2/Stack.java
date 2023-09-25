package de.hs_el.streekmann.algodat.aufgabe2;

public interface Stack<E> {
    boolean empty();
    E peek();
    E push(E item);
    E pop();
}
