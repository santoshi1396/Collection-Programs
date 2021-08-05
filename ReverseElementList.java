//4. Write a Java program to iterate a linked list in reverse order.  

import java.util.*;
public class ReverseElementList{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	ll.add("Orange");
	
	System.out.println(ll);
	
	Collections.reverse(ll);
	System.out.println("Elements after Reverse: "+ll);	
	}
}	