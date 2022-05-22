package com.nexttech.test7;

import java.util.HashMap;

public class hashmappractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String>country = new HashMap<String,String>();
HashMap<String, String> capitalCities = null;
//add key and values (country,city)
capitalCities.put("Bangladesh","Dhaka");
capitalCities.put("India", "Delhi");
capitalCities.put("Vutan", "timfi");
capitalCities.put("U.S.A", "WashsitonDC");
//access
capitalCities.get("Bangladesh");
System.out.println(capitalCities.get("Bangladesh"));

	}

}
