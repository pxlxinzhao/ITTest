package com.patrickpu.test.exception;

public class ExceptionGenerator {
	public void createException() throws Exception {
		if (new Integer(3) instanceof Object) {
			throw new Exception("asdf");
		}else {
			throw new Exception("asdf");
		}
		
	}
}
