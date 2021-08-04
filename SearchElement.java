//7. Write a Java program to search an element in a array list.  

import java.util.*;
public class SearchElement{
	public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	
	System.out.println(al);
	
	if(al.contains("Red")){
	System.out.println("Sucessfully Searched");
	}else{
		System.out.println("Not found");
		}
	if(al.contains("Purple")){
	System.out.println("Sucessfully Searched");
	}else{
		System.out.println("Not found");
		}
	}
}
