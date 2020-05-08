package me.tjwang.simbo_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntStackTest
{
    @Test
    public void testPushShouldBeEmpty()
    {
        IntStack stack = new IntStack();
        assertTrue("testPushShouldBeEmpty", stack.isEmpty());
    }

    @Test
    public void testNotEmptyWithSomething() {
        IntStack stack = new IntStack();
        stack.push(5);
        assertTrue("testNotEmptyWithSomething", !stack.isEmpty());
    }

    @Test
    public void testTopWithSomethinig() {
        IntStack stack = new IntStack();
        stack.push(5);
        int expected = 5;
        assertEquals("testNotEmptyWithSomething", expected, stack.peek());
    }

    @Test(expected=IntStack.OperationException.class)
    public void testPopException() {
        IntStack stack = new IntStack();
        stack.pop();
    }

    @Test(expected = IntStack.OperationException.class)
    public void testPeekException() {
        IntStack stack = new IntStack();
        stack.peek();
    }

    @Test(expected = IntStack.OperationException.class)
    public void testStackGetMaxException() {
        IntStack stack = new IntStack();
        stack.getMax();
    }

    @Test
    public void testStackGetMaxAStuff() {
        IntStack stack = new IntStack();
        int expected = 1;
        stack.push(1);
        assertEquals("testStackGetMaxAStuff", expected, stack.getMax());
    }

    @Test
    public void testStackGetMaxOneThenTwo() {
        IntStack stack = new IntStack();
        int expected = 2;
        stack.push(1);
        stack.push(2);
        assertEquals("testStackGetMaxOneThenTwo", expected, stack.getMax());
    }

    @Test
    public void testStackGetMaxTwoThenOne() {
        IntStack stack = new IntStack();
        int expected = 2;
        stack.push(2);
        stack.push(1);
        assertEquals("testStackGetMaxTwoThenOne", expected, stack.getMax());
    }
    @Test
    public void testStackGetMax1PopMaxBecomeOne() {
        IntStack stack = new IntStack();
        int expected = 1;
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals("testStackGetMax1PopMaxBecomeOne", expected, stack.getMax());
    }
    @Test
    public void testStackGetMax2PopStillMax() {
        IntStack stack = new IntStack();
        int expected = 2;
        stack.push(2);
        stack.push(1);
        stack.pop();
        assertEquals("testStackGetMax2PopStillMax", expected, stack.getMax());
    }

    @Test
    public void testStackPushPushPopPopIsEmpty() {
        IntStack stack = new IntStack();
        stack.push(2);
        stack.push(1);
        stack.pop();
        stack.pop();
        assertTrue("testStackPushPushPopPopIsEmpty", stack.isEmpty());
    }
}
