//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.  
import java.util.*;
public class OccuranceofElements{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	
	System.out.println(ll);
	
	Object firstele=ll.getFirst();
	System.out.println("First element is: "+firstele);
	
	Object lastele=ll.getLast();
	System.out.println("Last element is:"+lastele);
	}
}	