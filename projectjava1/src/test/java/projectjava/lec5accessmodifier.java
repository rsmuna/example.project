package projectjava;

public class lec5accessmodifier {
//attribute 
	int a =10;
	String car = "nissan";
	
	//method
	//accessmodifier return type method name(){}
	
	public void fblogin() {
		//body of code
	}
	public void fbloginp() {
	//body of code	
	}
	private void methods() {
		//body
	}
	void methods() {
		
	}
	public static void main(String[] args) {
		// create object of the class
		//classname object nameof the class = new classname
		 lec5accessmodifier accessmodifier = new  lec5accessmodifier();
		 System.out.println(accessmodifier. car);
		 accessmodifier.fbloginp();
		 
	
	}
	
}





