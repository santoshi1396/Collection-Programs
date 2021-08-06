//8. Write a Java program to insert the specified element at the end of a linked list.  
import java.util.*;
public class EndElements{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	System.out.println(ll);
	
	ll.offerLast("Orange");
		System.out.println("After inserting last element: "+ll);
	}
}	
