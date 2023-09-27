package de.hs_el.streekmann.algodat.aufgabe2;


import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackLinkTest {
    private Stack<Integer> stack;
	
	@BeforeEach
	void beforeEach() {
		stack = new LinkedStack<>();
	}
	
	@Test
    void testPush() {
        stack.push(3);
        stack.push(1);
        assertEquals(1, stack.peek());
    }
    @Test
    void testPop() {
        stack.push(3);
        stack.push(1);
        assertEquals(1, stack.pop());
    }
    @Test
    void testPeek() {
        stack.push(3);
        stack.push(1);
        assertEquals(1, stack.peek());
    }
    @Test
    void testIsEmpty() {
        assertTrue(stack.empty());
        stack.push(3);
        assertFalse(stack.empty());
    }
   @Test
void testPushPop() {
    stack.push(3);
    stack.push(1);
    assertEquals(1, stack.pop());
    stack.push(2);
    assertEquals(2, stack.pop());
    assertEquals(3, stack.pop());
    assertTrue(stack.empty());
}

@Test
void testPushPeek() {
    stack.push(3);
    stack.push(1);
    assertEquals(1, stack.peek());
    stack.push(2);
    assertEquals(2, stack.peek());
    assertEquals(2, stack.pop());
    assertEquals(1, stack.peek());
    assertEquals(1, stack.pop());
    assertEquals(3, stack.peek());
    assertEquals(3, stack.pop());
    assertTrue(stack.empty());
}

@Test
void testPushPopEmpty() {
    assertTrue(stack.empty());
    assertThrows(EmptyStackException.class, () -> stack.pop());
    assertThrows(EmptyStackException.class, () -> stack.peek());
}

}
