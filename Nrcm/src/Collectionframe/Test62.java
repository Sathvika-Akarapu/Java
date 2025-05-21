package Collectionframe;
import java.util.*;
//list iterator

public class Test62 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);//prints in list format
		ListIterator i1=l1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());//list of indiviual objects
		}
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());//list of indiviual objects
		}
		
		
		

	}

}
