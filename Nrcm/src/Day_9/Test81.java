package Day_9;
import java.util.LinkedList;

public class Test81{

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);
		l1.addFirst(32);
		l1.addLast(44);
		l1.add(2, 33);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);

	}

}

