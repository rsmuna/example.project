package com.nexttech.Test3;

import java.util.ArrayList;

public class lec5arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<datatype>variable name=new ArrayList<datatype>();

ArrayList<String>Sportscars =  new ArrayList<String>();
Sportscars.add("BMW");
Sportscars.add("Nissan");
Sportscars.add("Mersedes");
Sportscars.add("Hunda");
for (int i = 0; i< Sportscars.size(); i++) {
	System.out.println(Sportscars.get(i));
}
//access

//Sportscars.get(1);
//System.out.println(Sportscars.add("1"));

//change the value
//Sportcars.set(1,"Bentley");
// to delete value

//Sportscars.remove(1);


				
		
		
	}

}
