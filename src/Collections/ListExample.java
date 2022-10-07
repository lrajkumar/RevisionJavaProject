package Collections;

import java.util.ArrayList;
import java.util.Collections;
/*
The ArrayList class implements the List interface. 
It uses a dynamic array to store the duplicate element of different data types.
The ArrayList class maintains the insertion order and is non-synchronized. 
The elements stored in the ArrayList class can be randomly accessed. */



public class ListExample {
           public static void main(String[] args) {
        	   
        	   ArrayList<Integer> li=new ArrayList<>();
        	   li.add(15);
        	   li.add(69);
        	   li.add(35);
        	   li.add(75);
        	   
        	  System.out.println("returning element "+li.get(1));//it will return the 2nd element, because index starts from 0
        	   
        	  //changing the element  
        	  li.set(1,100);  
        	   //Traversing list 
        	  
        	  //sorting in array
        	  Collections.sort(li);
        	    
        	   for(Integer j : li) {
        		   System.out.println("number = " +j);
        	   }
        	   
        	   
        	   
        	   /* li.forEach(i->System.out.println(i));
        	   //access element from the list
        	   //methods in array list
        	   int number=li.get(2);
        	   System.out.println("the accsses element is :  "+number);
        	   
        	  // int index=li.indexOf(3);
        	   //System.out.println("the index element is : "+index);
        	   
        	   int size=li.size();
        	   System.out.println("size " +size);
        	   
        	   boolean contain=li.contains(100);
        	   System.out.println(contain);
        	   
        	   int remove=li.remove(0);
        	   System.out.println(remove);
        	   
        	   int get=li.get(2);
        	   System.out.println(get);*/
        	   
		}
}
