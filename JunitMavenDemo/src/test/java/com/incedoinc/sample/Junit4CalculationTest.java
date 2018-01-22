package com.incedoinc.sample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit4CalculationTest {
	
	private static int[] arr;
	
	@BeforeClass
	public  static void setUp_BeforeClass(){
		System.out.println("Executed before All Tests!!");
		arr = new int[]{1,3,4,2};
	}
	
	@Before
	public void setUp_BeforeEachTest(){
		System.out.println("Executed before each Test!!");
	}

	//(timeout=1000)   //in ms
	@Test      
	public void testFindMax(){  
		System.out.println("in testFindMax");
		assertEquals(4,Calculation.findMax(arr));    
	}  
	 
	
	@After
	public void tearDown_AfterEachTest(){
		System.out.println("Executed after each Test!!");
	}
	
	@AfterClass
	public static void tearDown_AfterClass(){
		System.out.println("Executed after All Tests!!");
		arr=null;
	}
}
