//16. Write a Java program to clone an array list to another array list.  
import java.util.*;
public class CloneElements{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	al.add("Blue");
	al.add("Purple");

	
	System.out.println("Orignal Elements: "+al); 
	
	ArrayList<String> al2=(ArrayList<String>)al.clone();
	System.out.println("Clones Elements: "+al2);
	}
}	