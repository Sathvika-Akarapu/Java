package Day_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test77 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(2,5);
		System.out.println(l1);
		List<Object> extra=Arrays.asList(6,7,8);//convert array into list
		l1.addAll(1,extra);
		System.out.println(l1);
		Object[] arr=l1.toArray();//convert list into array
		for(Object a1:arr) {
			System.out.println(a1);
		}

}}