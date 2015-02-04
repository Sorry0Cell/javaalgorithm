package ssj.algorithm.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by shenshijun on 15/2/3.
 */
public class LinkedStackTest {
    @Test
    public void testStack() {
        LinkedStack<Integer> int_stack = new LinkedStack<>();
        assertTrue(int_stack.isEmpty());
        for (int i = 0; i < 100; i++) {
            int_stack.push(i);
        }
        assertEquals(int_stack.size(), 100);
        assertTrue(int_stack.head().equals(99));
        for (int i = 99; i >= 0; i--) {
            assertTrue(int_stack.pop().equals(i));
        }
        assertTrue(int_stack.isEmpty());
    }

    @Test
    public void testStacks() {
        LinkedStack<Integer> int_stack = new LinkedStack<>();
        assertTrue(int_stack.isEmpty());
        for (int i = 0; i < 100; i++) {
            int_stack.push(i);
        }
        assertEquals(int_stack.size(), 100);
        assertTrue(int_stack.head().equals(99));
        for (int i = 99; i >= 0; i--) {
            assertTrue(int_stack.pop().equals(i));
        }
        assertTrue(int_stack.isEmpty());
    }

}
