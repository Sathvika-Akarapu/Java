package Day_9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test74 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(2);
		l1.add("hi");
		l1.add(4);
		List<Object> l2=new ArrayList<Object>(l1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		System.out.println(l2);
		Iterator i1=l2.iterator();	
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}

