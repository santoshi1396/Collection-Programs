//18. Write a Java program to test an array list is empty or not.  
import java.util.*;
public class CheckElements{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	al.add("Blue");
	al.add("Purple");

	
	System.out.println("Orignal Elements: "+al);


	System.out.println(" ArrayList is empty or Not? "+al.isEmpty());
	
	al.removeAll(al);
	System.out.println(" ArrayList is Empty or Not? "+al.isEmpty());

	}
}