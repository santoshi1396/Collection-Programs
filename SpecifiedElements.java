//7. Write a Java program to insert the specified element at the front of a linked list.  
import java.util.*;
public class SpecifiedElements{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	System.out.println(ll);
		
	ll.offerFirst("Orange");

	
	System.out.println("Elements after inserting the specified element at the front of a linked list : "+ll);	
	}
}	