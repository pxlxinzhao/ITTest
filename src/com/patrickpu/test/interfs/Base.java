package com.patrickpu.test.interfs;

public interface Base {
	int i = 0;//final and static
	
	default void print() {
		System.out.println("Base");
	}
}
