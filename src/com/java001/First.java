package com.java001;

import java.util.HashMap;

public class First {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities.get("USA"));
		    //capitalCities.size();
		    System.out.println(capitalCities.size());
		    for (String i : capitalCities.keySet()) {
		      System.out.println(i);
		    }
		    for (String i : capitalCities.values()) {
		  System.out.println(i);
		}
		for (HashMap.Entry<String, String> entry : capitalCities.entrySet()) {
		            String country = entry.getKey();
		            String capital = entry.getValue();
		            System.out.println(country + capital);
		        }
	}

}
