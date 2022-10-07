package Collections;

import java.util.Iterator;
import java.util.LinkedList;

/*LinkedList implements the Collection interface. 
It uses a doubly linked list internally to store the elements.
It can store the duplicate elements. It maintains the insertion order and is not synchronized. 
In LinkedList, the manipulation is fast because no shifting is required.*/


public class LinkedListTutorial {
	public static void main(String[] args) {
		//int count[] = {23,22,25,27,28,31,32,32};
		LinkedList<Integer> al=new LinkedList<Integer>();
		al.add(23);
		al.add(32);
		al.add(26);
		al.add(27);
		al.add(29);
		al.add(32);
		al.add(24);
		al.add(18);
		al.add(32);
		
		al.forEach(i->System.out.println(i));
		for(Integer i:al) {
			System.out.println("Integer Iteration for Element "+i);
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println("Using normal for loop "+al);
		}
		
		Iterator<Integer> irr=al.iterator();
		while(irr.hasNext()) {
			System.out.println("Using Iterator "+irr.next());
		}
		
		
				
		
		
		
		
	}

}
