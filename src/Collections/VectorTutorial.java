package Collections;

import java.util.Iterator;
import java.util.Vector;

//Vector uses a dynamic array to store the data elements. 
//It is similar to ArrayList. However, 
//It is synchronized and contains many methods that are not the part of Collection framework.



public class VectorTutorial {
	public static void main(String[] args) {
		Vector<String> vi=new Vector<String>();
		vi.add("Aakash");
		vi.add("Adithiya");
		vi.add("Arun");
		vi.add("Athulya");
		vi.add("Anbu");
		
		vi.forEach(i->System.out.println(i));
	     for(String j:vi) {
	    	 System.out.println("Using enchanched for "+j);
	     }
		Iterator<String> ijj=vi.iterator();
		while(ijj.hasNext()) {
			System.out.println("Using Iterator "+ijj.next());
		}
		
		
		
	}
}
