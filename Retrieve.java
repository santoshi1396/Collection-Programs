//4. Write a Java program to retrieve an element (at a specified index) from a given array list.  
import java.util.*;
public class Retrieve{
	public static void main(String args[]){
	ArrayList<String> al=new ArrayList<String>();
	al.add("Black");
	al.add("White");
	al.add("Purple");
	al.add("Red");
	
	System.out.print(al);
	
	System.out.println("Elements Retrieved are: ");
	String ele1=al.get(0);
	System.out.println("First Retrieved Element: "+ele1);
	
	String ele2=al.get(3);
	System.out.println("Last Retrieved Element: "+ele2);
	}
}