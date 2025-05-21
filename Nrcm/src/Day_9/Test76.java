package Day_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1=new ArrayList<Object>();
		l1.add(2);
		l1.add("hi");
		l1.add(4);
		l1.add(2,"hello");
		System.out.println(l1);
		List<Object> extra=Arrays.asList("abc","cfr","kjh");
		l1.addAll(1,extra);
		System.out.println(l1);
		System.out.println(l1.get(1));//index position(to get the value)
		System.out.println(l1.indexOf("hello"));//to get the index postion
	}

}

