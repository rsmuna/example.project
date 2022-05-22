package com.nexttech.Test3;

public class lec0accessmodifier {

	
	int abc = 10;
	String car = "Highlander";
	
	// syntex of metnods
	//accessmodifier return type method name (){}
	
	public void facebooklogin() {
		//body of code
	}
	//
	public void facebooksignup() {
		//body of code
	}
	
	private void methodm() {
		//body
	}
	
	//default method
	void methodn () {
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lec0accessmodifier accessmodifier = new lec0accessmodifier();
		 accessmodifier.facebooklogin();
		 accessmodifier.facebooksignup();
		System.out.println(accessmodifier.car);

	}

}
