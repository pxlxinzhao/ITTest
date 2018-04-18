package com.patrickpu.test.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyJunitTest {
	
	@Test
	public void runTest() {
		
		testOneEqualOne();
		testOneEqualOne();
		testOneEqualOne();
		testOneEqualOne();
		testOneEqualOne();
		
	}; 
	
	@Test
	public void testOneEqualOne() {
		assertTrue(1 == 1);
	}
	
	@Test
	public void testTwoEqualThree() {
		assertFalse(2 == 3);
	}
	
}
