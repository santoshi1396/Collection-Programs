//8. Write a Java program to sort a given array list. 
import java.util.*;
public class SortElements{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	
	System.out.println(al); 
	
	Collections.sort(al);
	System.out.println(al);
	}
}
