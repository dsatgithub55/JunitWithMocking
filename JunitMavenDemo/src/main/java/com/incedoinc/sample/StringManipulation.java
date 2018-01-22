package com.incedoinc.sample;

public class StringManipulation {

	public String getUpperCase(String str) {
		
		if(str==null) {
			throw new NullPointerException();
		}
		
		return str.toUpperCase();
	}
}
