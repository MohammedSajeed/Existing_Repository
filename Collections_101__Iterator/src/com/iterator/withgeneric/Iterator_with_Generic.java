








package com.iterator.withgeneric;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_with_Generic {	
	public static void main(String args[]){
	    ArrayList names = new ArrayList();
	    names.add("Sajeed");
	    names.add("Saif");
	    names.add("Samar");
	    names.add(new Integer(10)); //Adding Integer value to String ArrayList
	 
	    Iterator it = names.iterator();
	    while(it.hasNext()) 
	    {
	      String obj = (String)it.next();
	      System.out.println(obj);
	    }
	  }
}
