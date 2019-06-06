package Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		//using O[n*n]
		String names[]= {"sd", "fg", "kli","kli", "sd"};
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])){
					System.out.println("duplicate element is :" +names[i]);
				}
			}
		}
		
		System.out.println("using O[n] : HashSet (stores unique values)*****");
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name)== false) {
				System.out.println("duplicate element is :" +name);
			}
		}
		
		System.out.println("Time Complexity : O[2n] : HashMap : stores the key, value pair in the form of attributes****");
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name : names) {
			Integer count = storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		
		System.out.println("get values from HashMap************");
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is :" +entry.getKey());
			}
		}
		
	}

}
