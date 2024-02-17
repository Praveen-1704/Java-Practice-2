package map;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Class {
	
	public static void main(String[] args) {
		
		HashMap H = new HashMap();
		
		H.put("Hiii",23);
		
		H.put("Byee", 21);
		
		H.put("hello",30);
		
		System.out.println(H);
		
		Set S  = H.keySet();
		
		for(Object s : S)
		{
			System.out.println(H.get(s));
		}
		
	}

}
