//15. Write a Java program of swap two elements in a linked list.  
import java.util.*;
public class SwapLinkElements{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	System.out.println(ll);
	
		Collections.swap(ll,0,2);
		System.out.println("After Swapping  elements  : "+ll);
	
	}
}	