package Collectionframe;

//list iterator
import java.util.*;

public class Test63 {

	public static void main(String[] args) {
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);//prints in list format
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());//list of indiviual objects
		}
		
		
		
		

	}

}
