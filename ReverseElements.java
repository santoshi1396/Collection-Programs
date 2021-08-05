//11. Write a Java program to reverse elements in a array list.  
import java.util.*;
public class ReverseElements{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	
	System.out.println("Orignal Elements: "+al); 
	
	Collections.reverse(al);
	System.out.println("Elements after Reverse: "+al);
	}
}