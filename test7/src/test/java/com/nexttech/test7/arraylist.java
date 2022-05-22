package com.nexttech.test7;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList datatype variablename = new ArrayList datatype();
	// add values
		ArrayList<String> flowers = new ArrayList<String>();
		flowers.add("tulip");
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("marrygold");
		for (int i = 0;i <flowers.size();i++) {
			 System.out.println(flowers.get(i)); 
		 }
		
		// access
		// flowers.get(1);
		// System.out.println(flowers.get(1));
	
		 //change
		// flowers.set(1,"beli");
		// System.out.println( flowers.set(1,"beli"));
		 
		 //remove
		 //flowers.remove(2);
		 //System.out.println(flowers.remove(2));
		 //size
		 //flowers.size();
		 //System.out.println( flowers.size()); 
		 
		
	}

}
