//Author: Alfonzo Luis Pastores
//Student Number: 2012-20165
//CMSC 128 AB-6L

import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() { //Test if the factorial function's result is correct
		MyCalculator calc = new MyCalculator();
		
		int actual = calc.nfactorial(3);
		
		assertEquals("3! is 6",6,actual,0.0);
		
	}

	@Test
	public void testBinarySearch() { //test if the binary search function returns the correct index
		
		MyCalculator calc2 = new MyCalculator();
		
		int [] array = {1,2,3,4};
		
		int actual = calc2.binarySearch(array, 2);
		
		assertEquals("Find 2",1,actual,0.0);
	}

}
