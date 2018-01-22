package com.incedoinc.sample;

public class MessageUtil {

	   private String message;

	   //Constructor
	   public MessageUtil(String message){
	      this.message = message; 
	   }

	   // prints the message
	   public String getMessage(){
	      System.out.println(message);
	      return message;
	   }   

	   // add "Hi!" to the message
	   public String getSalutationMessage(){
	      message = "Hi!" + message;
	      System.out.println(message);
	      return message;
	   }   
	} 
