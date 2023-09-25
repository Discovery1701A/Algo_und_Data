package de.hs_el.streekmann.algodat.aufgabe2;

import de.hs_el.streekmann.algodat.aufgabe1.LinkedList;
import de.hs_el.streekmann.algodat.aufgabe1.List;
import java.util.EmptyStackException;



	public class ListUsingStack<E> implements Stack<E> {


		private final List<E> list = new LinkedList<>();
		private E top;

		@Override
		public E push(E item) {
			list.add(item);
			top = item;
			return top;
		}

		@Override
		public E pop() {
			if (list.size() == 0) {
				throw new EmptyStackException();
			}
			E item = list.remove(list.size() - 1);
			if (list.size() > 0) {
				top = list.get(list.size() - 1);
			} else {
				top = null;
			}
			return item;
		}

		@Override
		public E peek() {
			if (list.size() == 0) {
			throw new EmptyStackException();
			}
			return top;
		}

		@Override
		public boolean empty() {
			return list.size() == 0;
		}
	}

	
