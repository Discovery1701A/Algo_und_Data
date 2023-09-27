package de.hs_el.streekmann.algodat.aufgabe2;
import java.util.EmptyStackException;
public class LinkedStack<E> implements Stack<E> {
	private class Node {
		E element;
		Node successor;

		Node(E element) {
			this.element = element;
			this.successor = null;
		}
	}
	Node top;
	@Override
	public boolean empty() {
		return top == null;
	
	}

	@Override
	public E peek() {
		if (empty()) {
			throw new EmptyStackException();
		}
		return top.element;
	}

	@Override
	public E push(E item) {
		
		Node newNode = new Node(item);
		newNode.successor = top;
		top = newNode;
		return item;
	}

	@Override
	public E pop() {
		if (empty()) {
			throw new EmptyStackException();
		}
		E item = top.element;
		top = top.successor;
		return item;
	}

}
