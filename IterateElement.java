//2. Write a Java program to iterate through all elements in a linked list.  
import java.util.*;
public class IterateElement{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	
	for (String element:ll )
	System.out.println(element);
	
	}

}