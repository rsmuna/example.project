package projectjava;

public class lec6inheritancechild extends lec6inheritanceparent {

//so we can reise the code from parent class to child classes for reuseibility
	
	// we can inharite by object of child class and we will extand parent class by using by key words
	
	
	public static void main(String[] args) {
		// create object of child class
		lec6inheritanceparent  child = lec6inheritanceparent();
		child.add(10, 12);
        child.add(10, 12, 13);
	}

}
