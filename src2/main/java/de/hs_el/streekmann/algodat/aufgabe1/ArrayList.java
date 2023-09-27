package de.hs_el.streekmann.algodat.aufgabe1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {

	static final int MAX_SIZE = 32;
	int size;
	E[] elementArray;
	@SuppressWarnings("unchecked")
	public ArrayList() {
		size = 0;
		elementArray = (E[]) new Object[MAX_SIZE];
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
	public boolean add(E element) {
		if (size < MAX_SIZE) {
			elementArray[size] = element;
			size++;
			return true;
		} else {
			return false;
		}
	}
int currentcoutgesamt = 0;
int currentcouteinzelt = 0;
	@Override
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
	
		currentcouteinzelt = 0;
		currentcoutgesamt++;
		currentcouteinzelt++;
		return elementArray[index];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}
	int nextcountgesamt = 0;
	int nextcounteinzelt = 0;
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int nextIndex = 0;
			int currentIndex;

			@Override
			public boolean hasNext() {
				return nextIndex < size;
			}

			@Override
			public E next() {
				if (nextIndex == size) {
					throw new NoSuchElementException();
				}
				currentIndex = nextIndex;
				if (nextIndex < size) {
					nextIndex++;
				}
				nextcounteinzelt = 0;
				nextcountgesamt++;
				nextcounteinzelt++;
				return elementArray[currentIndex];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};

	}
	@Override
	public int getNextCountGesamt() {
		return nextcountgesamt;
	}
	public int getNextCountEinzelt() {
		return nextcounteinzelt;
	}

}
