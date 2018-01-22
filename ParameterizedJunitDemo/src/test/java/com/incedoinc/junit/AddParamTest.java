package com.incedoinc.junit;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.incedoinc.demo.Calculator;

@RunWith(Parameterized.class)
public class AddParamTest {
	
	private double expectedResult;
	private double expectedSubResult;
	private double firstValue;
	private double secondValue;
	
	Calculator cal;
	
	@Before
	public void setUp(){
		cal = new Calculator();
	}
	
	public AddParamTest(double expectedResult,double expectedsubResult,double firstValue, double secondValue) {
       this.expectedResult=expectedResult;
       this.expectedSubResult=expectedsubResult;
       this.firstValue=firstValue;
       this.secondValue=secondValue;
	}
	
	@Parameters
	public static Collection<Object[]> testData(){
		Object[][] data = new Object[][]{
				{7.0,-1.0,3.0,4.0},
				{6.0,-6.0,0.0,6.0},
				{7.0,1.0,4.0,3.0}
		};
		
		return Arrays.asList(data);
	}
	

	@Test
	public void testAdd(){
		Assert.assertEquals(expectedResult, cal.add(firstValue,secondValue));
	}
	
	@Test
	public void testSubtract(){
		Assert.assertEquals(expectedSubResult, cal.subtract(firstValue,secondValue));
	}
}
