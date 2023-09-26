package de.hs_el.streekmann.algodat.aufgabe2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class QueueLinkTest {
    private Queue<Integer> queue;
	
	@BeforeEach
	void beforeEach() {
		queue = new LinkedQueue<>();
	}
   
    
    @Test
        void testDequeue() {
            queue.enqueue(3);
            queue.enqueue(1);
            assertEquals(3, queue.dequeue());
        }
    
        @Test
        void testEnqueue() {
            queue.enqueue(1);
            assertFalse(queue.empty());
        }
        @Test
        void testIsEmpty() {
            assertTrue(queue.empty());
            queue.enqueue(3);
            assertFalse(queue.empty());
        }
        @Test
        void testEnqueueDequeue() {
            queue.enqueue(3);
            queue.enqueue(1);
            assertEquals(3, queue.dequeue());
            queue.enqueue(2);
            assertEquals(1, queue.dequeue());
            assertEquals(2, queue.dequeue());
            assertTrue(queue.empty());
        }
    }
