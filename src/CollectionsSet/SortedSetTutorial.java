package CollectionsSet;

import java.util.Iterator;
import java.util.TreeSet;

/*SortedSet is the alternate of Set interface that provides a total ordering on its elements.
The elements of the SortedSet are arranged in the increasing (ascending) order.
The SortedSet provides the additional methods that inhibit the natural ordering of the elements. 

SortedSet<data-type> set = new TreeSet(); 
*/


public class SortedSetTutorial {
         public static void main(String[] args) {
			TreeSet<String> ji=new TreeSet<String>();
			ji.add("Anbu");
			ji.add("Diwakar");
			ji.add("Magesh");
			ji.add("Ramesh");
			ji.add("Zarina");
			
			Iterator<String> ijj2=ji.iterator();
			while(ijj2.hasNext()) {
				System.out.println("Iterator "+ijj2.next());
			}
			
			
		}
}
