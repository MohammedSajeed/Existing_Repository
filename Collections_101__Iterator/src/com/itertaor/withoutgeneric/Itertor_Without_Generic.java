package com.itertaor.withoutgeneric;

import java.util.ArrayList;
import java.util.Iterator;

public class Itertor_Without_Generic {

	 public static void main(String args[]){
		    ArrayList names = new ArrayList();
		    names.add("Sajeed");
		    names.add("Saif");
		    names.add("Samar");
		 
		    Iterator it = names.iterator();
		 
		    while(it.hasNext()) {
		      String obj = (String)it.next();
		      System.out.println(obj);
		    }
		  }
}
