package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashSet {
//Write code to add items to hashset


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add("Navya");
		hashSet.add(20);
		hashSet.add("Navya");
		
		
		
		//Write code to retrieve items to hashset
		   for (Object v : hashSet)
			      System.out.print(v + " ");
			    System.out.println();
		
	}
	
	}


