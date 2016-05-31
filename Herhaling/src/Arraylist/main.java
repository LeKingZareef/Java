package Arraylist;

import java.util.*;

public class main {
   public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	  ArrayList<String> al = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  al.add("Ravi");
	  al.add("Vijay");
	  al.add("Ajay");
	  al.remove("Ravi");
	  al.add("Ajay");

	  /* Displaying array list elements */
	  for(String obj: al){
		  System.out.println(obj);
	  }
	  //System.out.println("Currently the array list has following elements:"+obj);

//	  /*Add element at the given index*/
//	  obj.add(0, "Rahul");
//	  obj.add(1, "Justin");
//
//	  /*Remove elements from array list like this*/
//	  obj.remove("Chaitanya");
//	  obj.remove("Harry");
//
//	  System.out.println("Current array list is:"+obj);
//
//	  /*Remove element from the given index*/
//	  obj.remove(1);
//	  
//	  System.out.println("Current array list is:"+obj);
//	
//	  obj.set(3, "King");
//	  
//	  System.out.println("Current array list is:"+obj);
   }
}