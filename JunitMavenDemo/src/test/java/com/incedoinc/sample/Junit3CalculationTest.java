package com.incedoinc.sample;

import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;

public class Junit3CalculationTest extends TestCase {
	
	private int[] arr;

	 public void setUp(){
		System.out.println("Executed before each Test!!");
		arr = new int[]{-1,1,3,4,2};
	 }
	 
	 
	 public void testFindMax(){  
			System.out.println("in testFindMax");
			assertEquals(4,Calculation.findMax(arr));    
	}
	
	 
	 public void tearDown(){
		 System.out.println("Executed after each Test!!");
		 arr = null;
	 }
}
