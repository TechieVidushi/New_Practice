package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	
	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RTP");
		ll.add("RFT");
		
		System.out.println("content :"+ll);
		
		ll.addFirst("Naveen");
		ll.addLast("Automation");
		
		System.out.println("full :"+ll);
		System.out.println(ll.get(0));
		ll.set(0, "create");
		System.out.println(ll.get(0));
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		ll.remove(2);
		System.out.println(ll);
		System.out.println("***for loop");
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		System.out.println("***using adv for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		System.out.println("**using Iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**using while");
		int n=0;
		while(ll.size()>n) {
			System.out.println(ll.get(n));
			n++;
		}
	}

}
