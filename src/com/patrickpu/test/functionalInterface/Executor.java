package com.patrickpu.test.functionalInterface;

public class Executor<T> {

	public void execute(T t, Tranformer<T> transformer) {
		// TODO Auto-generated method stub
		transformer.transform(t);
	}

}
