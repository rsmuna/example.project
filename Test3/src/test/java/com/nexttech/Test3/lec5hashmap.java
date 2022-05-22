package com.nexttech.Test3;

import java.util.HashMap;

public class lec5hashmap {

	public static void main(String[] args) {
		// to store paired value=> key,value
		
HashMap <Integer, String> country = new HashMap <Integer, String>();

country.put(1,"Bangladesh");
country.put(2,"India");
country.put(3,"pakistan");
country.put(4,"canada");
System.out.println(country);


//create a HashMap object called capital cities
HashMap <String, String>counrty, capital = new HashMap <String, String>();
country.put(1,"Bangladesh, Dhaka");
country.put(2,"India, delhi");
country.put(3,"pakistan, islamabad");
country.put(4,"canada , montril");
System.out.println(country);

	}

}
