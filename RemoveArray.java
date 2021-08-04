//6. Write a Java program to remove the third element from a array list.  
import java.util.*;
public class RemoveArray{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	
	System.out.println(al);
	
	String ele=al.remove(0);
	System.out.println("Removed element "+ele);
	
		System.out.println(al);
	
	}
}
