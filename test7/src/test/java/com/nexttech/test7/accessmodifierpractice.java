package com.nexttech.test7;

public class accessmodifierpractice {
//attribute of the class
int a =777;
String car ="highlander";

//method
//accessmodifierpractice returntype method name(){}

public void fblogin() {
	// body of code
}
	
public void fbsignin() {
	//body of code
}
private void methodm() {
	
}
	
public void methodn() {
	
}
	
	public static void main(String[] args) {
		// classname object of the class = new classname();
		
		accessmodifierpractice myobj = new accessmodifierpractice() ;
	System.out.println(myobj.car);	
	myobj.methodm();
//	changing the value 777 to 100
	myobj.a = 100;
	
	
	System.out.println(myobj.a);
	 
		
	}

}
