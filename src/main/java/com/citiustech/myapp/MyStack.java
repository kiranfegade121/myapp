package com.citiustech.myapp;

import java.util.LinkedList;

import com.citiustech.myapp.exception.EmptyMyStackException;

/**
 * Custom implementation of Stack using LinkedList collection
 * 
 * @author Amit Fegade
 *
 * @param <T> the type of elements held in this Stack
 */
public class MyStack<T> {
	
	private LinkedList<T> data = new LinkedList<>();
	
	/**
	 * Adds element at the end of the Stack.
	 * @param element
	 */
	public void push(T element) {
		data.addLast(element);
	}
	
	/**
	 * Removes and returns the top most element from the Stack.
	 *  
	 * @return Top most element from Stack.	 * 
	 * @throws EmptyMyStackException if stack is empty.
	 */
	public T pop() throws EmptyMyStackException {
		if (data.isEmpty()) 
			throw new EmptyMyStackException("Stack is empty");
		return data.removeLast();
				
	}
	
	/**
	 * Returns the top most element from the Stack but do not remove it.
	 *  
	 * @return Top most element from Stack.	 * 
	 * @throws EmptyMyStackException if stack is empty.
	 */
	public T peek() throws EmptyMyStackException {
		if (isEmpty()) 
			throw new EmptyMyStackException("Stack is empty");
		return data.getLast();				
	}
	
	/**
	 * Returns the number of elements in the Stack.
	 * 
	 * @return the number of elements in the Stack.
	 */
	public int size() {
		return data.size();
	}
	
	/**
	 * <p>This implementation returns <tt>size() == 0</tt>.
	 */
	public boolean isEmpty() {
		return size() == 0;
	}	
}
