package com.java001;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
public class Arraylist {

	public static void main(String[] args) {
	
		    ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    System.out.println("Original order: " + cars);
		    for (String i : cars) {
		      System.out.println(i);
		    }
		    
		    Collections.sort(cars);

		    System.out.println("Sorted order: " + cars);
		    for (String i : cars) {
		      System.out.println(i);
		    }
		    System.out.println("==========================");
		    
		    Comparator<String> customComparator = new Comparator<String>() {
		      @Override
		      public int compare(String car1, String car2) {
		        // Compare car2 to car1 to get descending order
		        return car2.compareTo(car1);
		      }
		    };

		    // Sort the ArrayList using the custom comparator
		    Collections.sort(cars, customComparator);

		    System.out.println("Descending order: " + cars);
		    System.out.println("==========================");
		    
		    Vector<String> vector = new Vector<String>();
		    vector.addAll(cars);
		    System.out.println("VECTOR: " + vector);
		    for (String k : vector) {
		      System.out.println(k);
		    }
		    
		    System.out.println("==========================");
		    
		    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		    myNumbers.add(33);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(34);
		    myNumbers.add(8);
		    myNumbers.add(12);
		    System.out.println(myNumbers);
		    System.out.println("Original order: " + myNumbers);
		    for (Integer j : myNumbers) {
		      System.out.println(j);
		    }
		    
		    Collections.sort(myNumbers);

		    System.out.println("Sorted order: " + myNumbers);
		    for (Integer j : myNumbers) {
		      System.out.println(j);
		      }
		      System.out.println("==========================");
		      
		   
		


	}

}
