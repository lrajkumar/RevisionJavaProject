package CollectionsQueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*Deque interface extends the Queue interface.
In Deque, we can remove and add the elements from both the side. 
Deque stands for a double-ended queue which enables us to perform the operations at both the ends.

Deque can be instantiated as:
Deque d = new ArrayDeque(); 


ArrayDeque class implements the Deque interface. 
It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.*/



public class DequeTutorial {
	public static void main(String[] args) {
		Deque<String> d=new ArrayDeque<String>();
		d.add("Raj"); //First in first out
		d.add("Ramesh");
		d.add("Rajesh");
		d.add("Rakesk");
		d.add("Hema");
		                      
	 
		for(String v:d) {
			System.out.println("Using enchanced For "+v);
		}
		Iterator<String> ji=d.iterator();
		while(ji.hasNext()) {
			System.out.println("Using iterator "+ji.next());
		}
		
		
	}

}
