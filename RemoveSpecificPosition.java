//12. Write a Java program to remove a specified element from a linked list.  
import java.util.*;
public class RemoveSpecificPosition{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	System.out.println(ll);
	
	ll.remove("Purple");
		System.out.println("After Removing element : "+ll);
	}
}	
