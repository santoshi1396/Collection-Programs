//2. Write a Java program to iterate through all elements in a array list.  
import java.util.*;

public class ColorsIteration{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<String>();
			System.out.println("Colors in Collection: \n");
				al.add("Pink");
				al.add("Red");
				al.add("Orange");
				al.add("Purple");
				al.add("Yellow");

		Iterator itr=al.iterator();
		while(itr.hasNext())
			{
		System.out.println(itr.next());	
			}
	
	}

}
