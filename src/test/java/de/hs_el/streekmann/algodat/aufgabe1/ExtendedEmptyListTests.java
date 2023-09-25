package de.hs_el.streekmann.algodat.aufgabe1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExtendedEmptyListTests {
	
	private List<Integer> list;

	@BeforeEach
	void setUp() {
		list = new LinkedList<>();
	}

	@Test
	void testIndexOfNonExistingElement() {
		int index = list.indexOf(1);
		assertEquals(-1, index);
	}
	
	@Test
	void testRemoveElement() {
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
	}
	
	@Test
	void testRemovePreIndex() {
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
	}
	
	@Test 
	void testRemovePostIndex() {
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
	}
	
	@Test 
	void testRemoveUncontainedElementReturnValue() {
		boolean removed = list.remove(Integer.valueOf(9));
		assertFalse(removed);
	}
	
	@Test 
	void testRemoveUncontainedElementListSize() {
		list.remove(Integer.valueOf(9));
		assertEquals(0, list.size());
	}
	
	@Test
	void testAddAndRemove() {
		list.add(1);
		list.remove(0);
		assertEquals(0, list.size());
	}

}
