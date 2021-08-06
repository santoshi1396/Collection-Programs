//6. Write a Java program to insert elements into the linked list at the first and last position.  
import java.util.*;
public class InsertElements{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	System.out.println(ll);
		
	/*ll.set(0,"Orange");

	 ll.set(4,"Grey"); */
	
	ll.offerFirst("Orange");
	ll.offerLast("Grey");
	
	System.out.println("Elements after Insertion: "+ll);	
	}
}	