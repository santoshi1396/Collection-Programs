//5. Write a Java program to update specific array element by given element.  
import java.util.*;
public class UpdateArray{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	
	System.out.println(al);
	
	String ele=al.set(0,"Purple");
	System.out.println("Updated element "+ele);
	
		//al.set(2,"White");

		System.out.println(al);	
	}
}