package com.nexttech.projectjava2;

public class lecaccessmodifiremethod {

//attribute
	int a = 10;
	String car = "Nissan";
	
	//syntax of method
	
	//accessmodifier returnType method name (){}
	
	//body of code
	
	public void facebooklogin() {
		//body of code
	}
	
	public void facebooksignup() {
		//body of code
	}
	//private method
	private void methodP() {
		//body
	}
//default method	
	void method() {
		//body
	}
	
	
	
	
	public static void main(String[] args) {
		// create object ofthe class
		//classname object name of the class = new classname();
		
		
		 lecaccessmodifiremethods accessmodifier = new lecaccessmodifiremethods(); 
		 System.out.println(accessmodifier.car);
		 
		 accessmodifier.methodp();
		//changing the value from 10 to 100 
		 accessmodifier.a=100;
		 System.out.println(accessmodifier.a);
		 
		

	}

}
