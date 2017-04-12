package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap {
	
	//write code to add items HashMap
	
	public static void main(String[] args) {
		
		Map<String,String> hashMap = new HashMap<String,String>();
		hashMap.put("Navya", "reddy");
		hashMap.put("sai", "baba");
		hashMap.put("Navya1", "reddy");
		
		//write code to retrieve items HashMap

		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	
		
	}

}
