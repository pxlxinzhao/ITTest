package com.patrickpu.test.generics;

public class Node<T> {

	
	public T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		System.out.println("Node set data");
		this.data = data;
	}

	public Node(T data) {
		super();
		this.data = data;
	}

	public Node() {
		super();
	}
}
