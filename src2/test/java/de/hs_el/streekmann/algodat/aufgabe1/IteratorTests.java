package de.hs_el.streekmann.algodat.aufgabe1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IteratorTests {
	private List<Integer> list;
	
	@BeforeEach
	void beforeEach() {
		list = new LinkedList<>();
	}
	
	@Test
	void testHasNextEmptyList() {
		Iterator<Integer> iterator = list.iterator();
		boolean hasNext = iterator.hasNext();
		assertFalse(hasNext);
	}
	
	@Test
	void testHasNextFilledList() {
		list.add(0);
		Iterator<Integer> iterator = list.iterator();
		boolean hasNext = iterator.hasNext();
		assertTrue(hasNext);
	}

	@Test
	void testNext() {
		list.add(0);
		Iterator<Integer> iterator = list.iterator();
		int next = iterator.next();
		assertEquals(0, next);
	}
	
	@Test
	void testNextOnEmptyList() {
		Iterator<Integer> iterator = list.iterator();
		assertThrows(NoSuchElementException.class, () -> iterator.next());
	}
	
	@Test
	void testNextOnLastElement() {
		list.add(0);
		Iterator<Integer> iterator = list.iterator();
		iterator.next();
		assertThrows(NoSuchElementException.class, () -> iterator.next());
	}
}
