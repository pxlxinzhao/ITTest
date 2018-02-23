package com.patrickpu.test.interfs;

public class BaseImpl implements Base, Base2{
	
	public static class InnerBase{
		public void print() {
			System.out.println("hehe");
			
			Object o;
		}
	}
}
