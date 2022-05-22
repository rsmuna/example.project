package com.nexttech.test7;

import java.util.ArrayList;

public class arraylistpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<String>cities = new ArrayList<String>();
		ArrayList<String> cities = new ArrayList<String>();
		
//add value
		cities.add("Dhaka");
		cities.add("Chittangong");
		cities.add("Khulna");
		cities.add("CoxBazar");
		cities.add("cummilla");
		for (int i = 0;i<cities.size();i++) {
			System.out.println(cities.get(i)); 	
		}
		
		
		
		//access
		//cities.get(2);
		//System.out.println(cities.get(2));
		//change the item
		//cities.set(4,"savar");
		//System.out.println(cities.set(4,"savar"));
		//remove
		//cities.remove(0);
		//System.out.println(cities.remove(0));
		//size
		//cities.size();
		//System.out.println(cities.size());
		
		
		
	}

}
