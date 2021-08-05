//14. Write a Java program of swap two elements in an array list.  
import java.util.*;
public class SwapElements{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	al.add("Blue");
	al.add("Purple");

	
	System.out.println("Orignal Elements: "+al); 
	
	Collections.swap(al,0,2);
	System.out.println("Elements after swap: "+al);
	}
}