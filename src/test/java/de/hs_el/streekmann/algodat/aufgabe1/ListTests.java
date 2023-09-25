package de.hs_el.streekmann.algodat.aufgabe1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListTests {
	private List<Integer> list;
	
	@BeforeEach
	void beforeEach() {
		list = new LinkedList<>();
	}
	
	@Test
	void testGetOnEmptyList() {	
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
	}
	
	@Test
	void testGetOnFilledList() {
		list.add(17);
		assertEquals(17, (int)list.get(0));
	}
	
	@Test
	void testGetPreIndex() {
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));	
	}
	
	@Test
	void testGetPostIndex() {
		list.add(17);
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
	}
	
	@Test
	void testSizeEmptyList() {
		int size = list.size();
		assertEquals(0, size);
	}
	
	@Test
	void testSizeFilledList() {
		list.add(1);
		list.add(2);
		list.add(3);
		int size = list.size();
		assertEquals(3, size);
	}
	
	@Test
	void testAddReturnValue() {
		boolean addition = list.add(5);
		assertTrue(addition);
	}
	
	@Test
	void testAddSizeIncreased() {
		assertEquals(0, list.size());
		list.add(5);
		assertEquals(1, list.size());
	}
	
	@Test
	void testAddContainment() {
		list.add(5);
		assertEquals(5, (int)list.get(0));
	}
	
	@Test
	void testAddCorrectOrder() {
		list.add(5);
		list.add(7);
		list.add(2);
		assertEquals(5, (int)list.get(0));
		assertEquals(7, (int)list.get(1));
		assertEquals(2, (int)list.get(2));
	}
}
