//13. Write a Java program to compare two array lists.  
import java.util.*;
public class CompareElements{
	public static void main(String args[]){
	ArrayList<String>al1=new ArrayList<String>();
	al1.add("Red");
	al1.add("Yellow");
	al1.add("Orange");
	al1.add("Black");
	
	System.out.println("First List: "+al1); 
	
	
	ArrayList<String>al2=new ArrayList<String>();
	al2.add("Pink");
	al2.add("Purple");
	al2.add("Grey");
	al2.add("Blue");
	
	System.out.println("Second List: "+al2); 
	
	ArrayList<String>al3=new ArrayList<String>();
	al3.add("Red");
	al3.add("Yellow");
	al3.add("Orange");
	al3.add("Black");
	
	System.out.println("Third List: "+al3); 
	
	boolean b=al1.equals(al2);
	boolean b1=al1.equals(al3);

	System.out.println(b);
	System.out.println(b1);

	}
}
	