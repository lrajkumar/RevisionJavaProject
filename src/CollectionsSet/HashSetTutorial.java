package CollectionsSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*HashSet class implements Set Interface. 
It represents the collection that uses a hash table for storage. 
Hashing is used to store the elements in the HashSet. It contains unique items.*/

public class HashSetTutorial {
	public static void main(String[] args) {
		 
		Set<String> li=new HashSet<String>();
		li.add("Anamika");
		li.add("Divya");
		li.add("Chandru");
		li.add("Bahavana");
		li.add(""); //allows null value
		
		Iterator<String> ji=li.iterator();
		while(ji.hasNext()) {
			System.out.println("ITERATOR "+ji.next());
		}
	}

}
