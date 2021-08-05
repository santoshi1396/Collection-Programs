//12. Write a Java program to extract a portion of a array list.  
import java.util.*;
public class ExtractPosition{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	al.add("Blue");
	al.add("Purple");

	
	System.out.println("Orignal Elements: "+al); 
	
	List<String> sub_List=al.subList(0,2);
	System.out.println("Elements Extracted: "+sub_List);
	}
}