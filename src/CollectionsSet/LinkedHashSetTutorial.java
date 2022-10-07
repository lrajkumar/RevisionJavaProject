package CollectionsSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*LinkedHashSet class represents the LinkedList implementation of Set Interface.
It extends the HashSet class and implements Set interface. 
Like HashSet, It also contains unique elements. 
It maintains the insertion order and permits null elements.*/




public class LinkedHashSetTutorial {
    public static void main(String[] args) {
		LinkedHashSet<String> ji=new LinkedHashSet<>();
		ji.add("Raj");
		ji.add("Kumar");
		ji.add("karthick");
		ji.add("Manoj");
		Iterator<String> ijj=ji.iterator();
		while(ijj.hasNext()) {
			System.out.println("iterator "+ijj.next());
		}
	
	}
}
