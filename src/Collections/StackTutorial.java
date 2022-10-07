package Collections;

import java.util.Iterator;
import java.util.Stack;

/*The stack is the subclass of Vector. 
It implements the last-in-first-out data structure, i.e., Stack. 
The stack contains all of the methods of Vector class and also provides its methods like boolean push(), 
boolean peek(), boolean push(object o), which defines its properties*/


public class StackTutorial {
   public static void main(String[] args) {
	Stack<String> ji=new Stack<String>();
	ji.push("Anish");
	ji.push("Aakash");
	ji.push("Aravind");
	ji.push("Boopathy");
	ji.pop();         //OIt includes lastIn first Out
	
	ji.forEach(i->System.out.println(i));
	for(String j:ji) {
		System.out.println("Using EnchANCED Forloop "+j);
	}
	
	Iterator<String> irr=ji.iterator();
	while(irr.hasNext()) {
		System.out.println("using Iterator "+irr.next());
	}
	
}
	
}
