//10. Write a Java program to shuffle elements in a array list.  

import java.util.*;
public class ShuffleElements{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	
	System.out.println("Orignal Elements: "+al); 
	
	Collections.shuffle(al);
	System.out.println("Elements after shuffle: "+al);
	}
}