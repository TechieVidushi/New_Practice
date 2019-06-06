package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		
	
	int b[] = new int[3];
	int a=40;
	ArrayList ar = new ArrayList();
	
	ar.add(10);	
	ar.add(20);
	ar.add(40);
	
	System.out.println(ar.size());
	
	ar.add(30);
	ar.add(50);
	ar.add(50);
	ar.add("test");
	ar.add(true);
	ar.add(a);
	
	System.out.println(ar.size());
	
	System.out.println(ar.get(3));
	
	for(int i = 0;i<ar.size();i++) {
		
		System.out.println(ar.get(i));
	}
	
	int r=10;
	
	//non generic vs generic
	
	ArrayList<Integer> ar2 = new ArrayList();
	ar2.add(r);
	ar2.add(2);
	
for(int i = 0;i<ar2.size();i++) {
		
		System.out.println(ar2.get(i));
	}
	
	ArrayList<String> ar3 = new ArrayList();
	ar3.add("test");
	ar3.add("reg");
	
	ArrayList<String> ar4 = new ArrayList();
	ar4.add("create");
	ar4.add("test");
	ar4.add("rey");
	
	//retainAll()
			ar3.retainAll(ar4);
			System.out.println(ar3);
	
	//add
	ar3.add("ui");
	
	//addAll()
	ar3.addAll(ar4);
	System.out.println(ar3);
	
	
		
	//removeAll
	ar3.removeAll(ar4);
	System.out.println(ar3);
	
	
	
	//Employee Class Objects
	
	Employee e1 = new Employee("Naveen",27,"QA");
	Employee e2 = new Employee("Geeta",45,"Dev");
	Employee e3 = new Employee("Vidushi",26,"Sr. QA");
	
	//Create ArrayList
	
	ArrayList<Employee> ar5 = new ArrayList<Employee>();
	ar5.add(e1);
	ar5.add(e2);
	ar5.add(e3);
	
	//iterator to traverse the values
	
	Iterator<Employee> it = ar5.iterator();
	while(it.hasNext()) {
		Employee emp = it.next();
	}
	


	}
}
