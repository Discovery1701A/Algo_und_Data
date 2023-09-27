package de.hs_el.streekmann.algodat.aufgabe1;

import java.util.Iterator;

public interface List<E> extends Iterable<E>{
	boolean add(E element);
	E get(int index);
	Iterator<E> iterator();
	int size();
	E remove(int index);
	boolean remove(Object o);
	int indexOf(Object o);
	int getCounteinzelt();
	int getCountgesamt();
	int getNextCountGesamt();
	int getNextCountEinzelt();
}
