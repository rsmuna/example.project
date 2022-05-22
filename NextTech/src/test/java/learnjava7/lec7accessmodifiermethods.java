package learnjava7;

public class lec7accessmodifiermethods {

 int a = 10;
 String car = "BMW";

//accessmodifier returnType method name(){}

public void fblohin() {
	//body of code
}

public void fbsignup() {
	//body of code
}
public void methoda() {
	//body of code
}
private void methodb() {
	//body
}
void methodc() {
	//body
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lec7accessmodifiermethods myobj = new lec7accessmodifiermethods();
		System.out.println(myobj.car);
		System.out.println(myobj.a);
		myobj.methodb();
		
		
		//changing the value 10 to 100
		myobj.a = 100;
		System.out.println(myobj.a );
		
		//changing the String BMW to Honda
		myobj.car = "honda";
		System.out.println(myobj.car);
		
	}

}
