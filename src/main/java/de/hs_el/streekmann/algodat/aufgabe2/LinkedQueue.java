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

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E enqueue(E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
