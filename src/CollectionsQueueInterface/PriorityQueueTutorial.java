package CollectionsQueueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;

/*The PriorityQueue class implements the Queue interface. 
It holds the elements or objects which are to be processed by their priorities. 
PriorityQueue doesn't allow null values to be stored in the queue.*/



public class PriorityQueueTutorial {
	public static void main(String[] args) {
		PriorityQueue<String> ijj=new PriorityQueue<String>();
		ijj.add("Shankar");
		ijj.add("Baskar");
		ijj.add("Anjali");
		ijj.add("Catherine");
		ijj.add("Diwakar");
		ijj.add("Eswar");
		
		//ijj.add(""); //It doesnot allow null values
		
		System.out.println("head "+ijj.element());
		System.out.println("Head "+ijj.poll());
		System.out.println("start the Iteration");
		
		Iterator<String> j=ijj.iterator();
		while(j.hasNext()) {
			System.out.println("Using Iterator "+j.next());
		}
		
		ijj.remove();
		ijj.poll();
		System.out.println("Removing two Elements");
		Iterator<String> ijj2=ijj.iterator();
		while(ijj2.hasNext()) {
			System.out.println("Using Iterator "+ijj2.next());
		}
		
	}

}
