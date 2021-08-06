//14. Write a Java program to remove all the elements from a linked list.  
import java.util.*;
public class RemoveElements{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	System.out.println(ll);
	
		ll.clear();
		System.out.println("After Removing  elements  : "+ll);
	
	}
}	