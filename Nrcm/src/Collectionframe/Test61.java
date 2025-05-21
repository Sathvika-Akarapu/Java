package Collectionframe;
import java.util.*;
//list-interface arraylist-class integer-wrapper class(everything should be in objects)
//<>  generics
//iterator program
public class Test61 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);//prints in list format
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());//list of indiviual objects
		}
		
		

	}

}
