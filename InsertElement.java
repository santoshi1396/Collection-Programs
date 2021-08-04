//3. Write a Java program to insert an element into the array list at the first position.  
import java.util.*;
public class InsertElement{
	public static void main(String args[]){
	ArrayList <String>al=new ArrayList<String>();
		al.add("Pink");
		al.add("Yellow");
		al.add("Purple");
		al.add("Red");
		
		System.out.println(al);
		
		System.out.println("Insert element to the Array: ");
		al.add(0,"Black");
		al.add(4,"Sky Blue");

		
		System.out.println(al);
	
	}
}

