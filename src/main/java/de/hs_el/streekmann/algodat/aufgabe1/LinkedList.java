package de.hs_el.streekmann.algodat.aufgabe1;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class LinkedList<E> implements List<E> {
	private class Node {
		E element;
		Node successor;

		Node(E element) {
			this.element = element;
			this.successor = null;
		}
	}

	Node firstNode;
	Node lastNode;
	int numberOfElements;

	public LinkedList() {
		Node emptyNode = new Node(null);
		firstNode = emptyNode;
		lastNode = emptyNode;
		numberOfElements = 0;
	}
	@Override
	public boolean add(E element) {
		Node addedNode = new Node(element);
		lastNode.successor = addedNode;
		lastNode = addedNode;
		numberOfElements++;
		return true;
	}
	@Override
	public E remove(int index) {
		if (index < 0 || index >= numberOfElements) {
			throw new IndexOutOfBoundsException();
		}

		Node preNode = firstNode; // erstes Element erstmal als vorheriges Node
		Node currentNode = firstNode.successor; // zweites Element erstmal als aktuelles Node
		for (int currentIndex = 0; currentIndex < index; currentIndex++) { // bis zum Index durchlaufen 
			preNode = currentNode; // aktuelles Node als vorheriges Node. alles eins zurück schieben
			currentNode = currentNode.successor;
		} // currentNode ist jetzt das zu löschende Element

		if (index == numberOfElements - 1) {
            lastNode = preNode;
        }
		E removedElement = currentNode.element;
		preNode.successor = currentNode.successor;
		numberOfElements--; // Anzahl der Elemente um 1 verringern
		return removedElement;
	}

	@Override
	public boolean remove(Object o) {
		Node preNode = firstNode; // erstes Element erstmal als vorheriges Node
		Node currentNode = firstNode.successor; // zweites Element erstmal als aktuelles Node
		while (currentNode != null) {
			if (o == null ? currentNode.element == null : o.equals(currentNode.element)) { // wenn das aktuelle Element das zu löschende Element ist
				if (preNode != null) {
					preNode.successor = currentNode.successor;
					if (currentNode == lastNode) {
                        lastNode = preNode;
                    }
					numberOfElements--;
					return true;
				} 
			}
			preNode = currentNode;
			currentNode = currentNode.successor;
		}
		return false;
	}

	@Override
	public int indexOf(Object o) {
		int index = 0;
		Node currentNode = firstNode;
		while (currentNode != null) {
			if (o == null ? currentNode.element == null : o.equals(currentNode.element)) { // wenn das aktuelle Element das gesuchte Element ist
				return index -1 ;
			}
			currentNode = currentNode.successor;
			index++;
		}
		return -1;
	}

int currentcoutgesamt = 0;
int currentcouteinzelt = 0;
	@Override
	public E get(int index) {

		if (index < 0 || index >= numberOfElements) {
			throw new IndexOutOfBoundsException();
		}
		Node nodeAtCurrentIndex = firstNode.successor;
		currentcouteinzelt= 0;
		for (int currentIndex = 0; currentIndex < index; currentIndex++) {
			nodeAtCurrentIndex = nodeAtCurrentIndex.successor;
			currentcoutgesamt++;
			currentcouteinzelt++;
		}
		return nodeAtCurrentIndex.element;

	}
	@Override
	public int  getCounteinzelt()
	{
		return currentcouteinzelt; 
	}
	@Override
	public int  getCountgesamt()
	{
		return currentcoutgesamt; 
	}

	@Override
	public int size() {
		return numberOfElements;
	}
int nextcountgesamt = 0;
int nextcounteinzelt =0;
public int  getNextCountGesamt(){
	return nextcountgesamt;
}
public int  getNextCountEinzelt(){
	return nextcounteinzelt;
}
	@Override
	public Iterator<E> iterator() {
		return new Iterator<>() {
			Node nextNode = firstNode;

			@Override

			public boolean hasNext() {
				return nextNode != null && nextNode.successor != null;
			}
			@Override
			public E next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				nextcounteinzelt = 0;
				nextcounteinzelt++;
				nextcountgesamt++;
				E element = nextNode.successor.element;
				nextNode = nextNode.successor;
				return element;
			
		}
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

}
