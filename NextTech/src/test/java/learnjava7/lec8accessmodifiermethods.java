package learnjava7;

public class lec8accessmodifiermethods {

			
	//attribute 
		int a =10;
		String car = "nissan";
		
		//method
		//accessmodifier return type method name(){}
		
		public void fblogin() {
			//body of code
		}
		public void fbsignin() {
		//body of code	
		}
		//private meyhod
		private void methodp() {
			//body
		}
		//default method
		void methodd() {
			//body
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lec8accessmodifiermethods Accessmidifier = new lec8accessmodifiermethods();
		System.out.println(Accessmidifier.car);
		Accessmidifier.methodp();
		
	}

}
