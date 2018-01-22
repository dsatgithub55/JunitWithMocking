package com.incedoinc.sample;

public class Calculation {

	 public static int findMax(int arr[]){  
	        int max=0;  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i]; 
	          //  i=0;  //timeout case
	        }  
	        return max;  
	 } 
	 
}
