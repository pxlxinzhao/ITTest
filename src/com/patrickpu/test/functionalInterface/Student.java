package com.patrickpu.test.functionalInterface;

public class Student {
	
	private boolean isValidated = false;
	private int age = 20;
	public boolean isValidated() {
		return isValidated;
	}
	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [isValidated=" + isValidated + ", age=" + age + "]";
	}
	
	

}
