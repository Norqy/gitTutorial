package com.gogoair.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gogoair.tutorial.Stack;

public class StackTest {
	
	@Test
	public void shouldPopFromStack() {
		final Integer I1 = new Integer(1);
		final Integer I2 = new Integer(2);
		final Integer I3 = new Integer(3);
		
		// given a stack containing data
		Stack<Integer> s = new Stack<Integer>();
		s.push(I1);
		s.push(I2);
		s.push(I3);
		
		// when I call pop
		Integer ret = s.pop();
		
		// then I should see the last item inserted
		assertEquals(I3,ret);
		// and size should decrease
		assertEquals(2,s.size());
	}
	
}
