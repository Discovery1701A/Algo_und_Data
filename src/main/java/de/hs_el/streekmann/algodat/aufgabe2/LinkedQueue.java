package de.hs_el.streekmann.algodat.aufgabe2;

public class LinkedQueue<E> implements Queue<E> {
	private class Node {
		E element;
		Node successor;

		Node(E element) {
			this.element = element;
			this.successor = null;
		}
	}
	Node emptyNode = new Node(null);
Node first = emptyNode ;
Node last = emptyNode;
int numberOfElements = 0;

	@Override
	public boolean empty() {
		return numberOfElements == 0;
	}

	@Override
	public E first() {
		return first.element;
	}

	@Override
	public E enqueue(E element) {
	Node newNode = new Node(element);
	if (empty()) {
		first = newNode;
		last = newNode;
	} else {
		last.successor = newNode;
		last = newNode;}
	numberOfElements++;
	return newNode.element;

	}

	@Override
	public E dequeue() {
		if (empty()) {
			return null;
		}
		E element = first.element;
		first = first.successor;
		if (first == last) {
			last = emptyNode;
		}
		
		numberOfElements--;
		if (numberOfElements == 0) {
			first = emptyNode;
			last = emptyNode;
		}
		return element;
	}
	
	
}
