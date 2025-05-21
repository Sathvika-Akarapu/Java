package Day_9;

import java.util.ArrayList;
import java.util.List;

public class Test72 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		List<Integer> l2=new ArrayList<Integer>(l1);
		
		l2.addAll(l1);
		System.out.println(l2);
	

	}

}


