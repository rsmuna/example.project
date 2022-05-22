package com.nexttech.Test3;

import java.util.HashMap;

public class lec5HashMapAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> country = new HashMap<String,String>();

country.put("Bangladesh", "Dhaka" );
country.put("India", "Delhi" );
country.put("Pakistan", "Islamabad" );
country.put("Vutan", "Timfu" );

System.out.println(country);
country.get("Bangladesh");
System.out.println("Bangladesh");
//remove
country.remove("India");
System.out.println("india");
//size



	}

}
