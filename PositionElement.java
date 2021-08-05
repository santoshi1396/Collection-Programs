//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.  
import java.util.*;
public class PositionElement{
	public static void main(String args[]){
	LinkedList<String> ll= new LinkedList<String>();
	ll.add("Black");
	ll.add("Purple");
	ll.add("Pink");
	ll.add("Yellow");
	ll.add("Red");
	ll.add("Orange");

	
	Iterator p = ll.listIterator(2);

   while (p.hasNext()) {
   System.out.println(p.next());
   }	
}

}