package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTutorial2 {
	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("Raj");
		li.add("Kumar");
		li.add("Rajesh");
		li.add("Ramesh");
		li.add("Raj");
		
		li.forEach(i->System.out.println(i));
		
		for(String i:li) {
			System.out.println("using for enchaned for "+i);
		}
		
		Iterator<String> itl=li.iterator();
		while(itl.hasNext()) {
			System.out.println("using iterator"+itl.next());
		}
		
		
	}

}
