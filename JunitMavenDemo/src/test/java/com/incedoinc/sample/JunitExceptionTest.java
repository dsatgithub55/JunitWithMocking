package com.incedoinc.sample;

import org.junit.Test;

import junit.framework.Assert;

//public class JunitExceptionTest {
public class JunitExceptionTest {

	@Test(expected= NullPointerException.class) 
	public void testString_UpperCase() { 
		StringManipulation manipulateString = new StringManipulation();
		String modifiedStr =manipulateString.getUpperCase(null);
		//String modifiedStr =manipulateString.getUpperCase("abc");
		//Assert.assertEquals("ABC", modifiedStr);
	}     

}
