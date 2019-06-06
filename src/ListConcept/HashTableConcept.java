package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	
	public static void main(String args[]) {
		
		//cloning concept
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Tom");
		h1.put(2, "Peter");
		h1.put(3, "Vidu");
		
		System.out.println("Values of h1" +h1);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		//h2 = (Hashtable)h1.clone();
		h2.put(1, "Tom");
		h2.put(2, "Peter");
		h2.put(3, "Vidu");
		
		//equals
		
				if(h2.equals(h1))
					System.out.println("h1 is equal to h2");
		
		System.out.println("Values of h2" +h2);
		
		//clear
		
		//h1.clear();
		
		System.out.println("cleared h1:" +h1);
		
		//containsValue
		
		Hashtable<Integer, String> st1 = new Hashtable<Integer, String>();
		st1.put(1, "Tom");
		st1.put(2, "Peter");
		st1.put(3, "Vidu");
		st1.put(3, "Vidu");
		st1.put(3, "Vidu");
		
		System.out.println("Check duplicates" +st1);
		
		if(st1.contains("Tom"))
			System.out.println("st1 contains Tom");
		
		//Enumeration : Traversing all the values
		
		Enumeration e = st1.elements();
		
		System.out.println("Print via Enumeration");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//Print via entrySet
		
		Set s = st1.entrySet();
		
		System.out.println("Print via entrySet" +s);
		
		//get a specific key
		
		System.out.println("get a specific key" + st1.get(1));
		
		//get hashcode
		
		System.out.println("get hashcode of h1" + h1.hashCode());
		
		System.out.println("get hashcode of h2" + h2.hashCode());
		
		System.out.println("get hashcode of st1" + st1.hashCode());
	}
	
	
	
	
	
	



}
