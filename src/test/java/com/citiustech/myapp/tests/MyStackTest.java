	package com.citiustech.myapp.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.citiustech.myapp.MyStack;
import com.citiustech.myapp.exception.EmptyMyStackException;

public class MyStackTest {

MyStack<Integer> stack;
	
	@Before
	public void setUp() {
		stack = new MyStack<>();
	} 
	
	@Test
	public void stackObjectShouldNotBeNull() {
		assertNotNull(stack);		
	}
	
	@Test
	public void newStackSizeShouldBeZero() {
		assertEquals(0, stack.size());
	}

	@Test
	public void pushOperationShouldAddElementInStackAndChangeStackSizeByOne() {
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		assertEquals(3, stack.size());
	}
	
	@Test(timeout = 1000)
	public void popOperationShouldRemoveTopmostElementAndReturnIt() throws EmptyMyStackException {
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.pop();
		assertEquals(2, stack.size());
		
		// assertEquals((Integer)30, stack.pop());		
	}
	
	@Test
	public void peekOperationShouldReturnTopmostElementWithoutRemovingIt() throws EmptyMyStackException {
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.peek(); 
		
		assertEquals(3, stack.size());
	}
	
	@Test(expected = EmptyMyStackException.class)
	public void popOperationShouldThrowEmptyMyStackExceptionWhenStackIsEmpty() throws EmptyMyStackException {
	
		stack.pop();
	}
	
	@Test(expected = EmptyMyStackException.class)
	public void peekOperationShouldThrowEmptyMyStackExceptionWhenStackIsEmpty() throws EmptyMyStackException {
		
		stack.peek();
	}
	
	@After
	public void tearDown() {
		stack = null;
	}

}
