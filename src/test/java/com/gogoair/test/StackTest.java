package com.gogoair.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gogoair.tutorial.Stack;

public class StackTest {
	
	@Test
	public void shouldPushToStack() {
		// given an empty stack
		Stack<Integer> s = new Stack<Integer>();
		
		//when I push a new item
		s.push(new Integer(1));
		
		// then I should see size increase to 1
		assertEquals(1,s.size());
	}
}
