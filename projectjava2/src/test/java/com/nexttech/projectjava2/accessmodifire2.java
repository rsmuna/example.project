package com.nexttech.projectjava2;

public class accessmodifire2 {
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
	// private method
	private void methodp() {
		//body
	}
	
	//default method
	void method() {
		//body
	}
	
	
	
	public static void main(String[] args) {
		// 	create object of the class
		//classname object name of the clss = new classname();
		
		 accessmodifire2 muna = new  accessmodifire2();
		 System.out.println(muna.car);
		 
		 
		 muna.methodp();
		 //changing the value from 10 to 100
		 muna.a=100;
		 System.out.println(muna.a);
		 
		
		
		
		
		
		
	}
}