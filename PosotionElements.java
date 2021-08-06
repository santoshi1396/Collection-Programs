//11. Write a Java program to display the elements and their positions in a linked list.  
import java.util.*;
import java.util.Iterator;

public class PosotionElements
	{
	public static void main(String args[]){
	LinkedList<String>ll=new LinkedList<String>();
	ll.add("Purple");
	ll.add("Yellow");
	ll.add("Pink");
	ll.add("Brown");
	
	
		for(int p=0;p<ll.size();p++)
		{
		System.out.println("Elements with Their positions: "+p+": "+ll.get(p));

		}
	}

}