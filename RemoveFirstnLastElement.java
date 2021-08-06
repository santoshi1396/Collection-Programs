//13. Write a Java program to remove first and last element from a linked list.  
import java.util.*;
public class RemoveFirstnLastElement{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	System.out.println(ll);
	
	Object rfirst=ll.removeFirst();
		System.out.println("First Removed element is: "+rfirst);
		System.out.println("After Removing First element  : "+ll);
		
	Object rlast=ll.removeLast();
		System.out.println(" Last  Removed element is: "+rlast);
		System.out.println("After Removing Last element  : "+ll);
	
	}
}	
