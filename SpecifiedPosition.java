//5. Write a Java program to insert the specified element at the specified position in the linked list.  
import java.util.*;
public class SpecificPosition{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	System.out.println(ll);
	
	ll.add(1,"Orange");
		System.out.println("After inserting element after Black: "+ll);
	}
}	
