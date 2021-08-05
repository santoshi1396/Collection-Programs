//17. Write a Java program to empty an array list.  

import java.util.*;
public class EmptyElements{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	al.add("Blue");
	al.add("Purple");

	
	System.out.println("Orignal Elements: "+al);

	al.removeAll(al);
	System.out.println("Elements after removal of all elelments: "+al);
	}
}