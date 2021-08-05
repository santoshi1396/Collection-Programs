//9. Write a Java program to copy one array list into another.  
import java.util.*;
public class CopyElements{
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
	
	Collections.copy(al1,al2);
		System.out.println("First Copied list: "+al1);
		
		System.out.println("Second Copied list: "+al2); 

	}
}
