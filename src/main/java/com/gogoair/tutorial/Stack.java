package com.gogoair.tutorial;

// added the first comment

public class Stack<E> {
	private class Node {
		public E data;
		public Node next;
		
		public Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	private int size;
	private Node top;
	
	public Stack() {
		this.size = 0;
		this.top = null;
	}
	
	public void push(E data) {
		top = new Node(data, top);
		this.size++;
	}
	
	public E pop() {
		if (top == null) {
			E data = top.data;
			top = top.next;
			this.size--;
			return data;
		}
		return null;
	}
	
	public E top() {
		if (top != null)
			return top.data;
		return null;
	}
	
	public int size() {
		return this.size;
	}
}
