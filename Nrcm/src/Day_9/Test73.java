package Day_9;
import java.util.ArrayList;
import java.util.List;

public class Test73 {

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
	

	}

}


