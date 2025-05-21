package Day_9;
import java.util.Iterator;
import java.util.Stack;

public class Test82{

	public static void main(String[] args) {
        Stack<Integer> s1=new Stack<Integer>();
        s1.push(33);
        s1.push(77);
        s1.push(99);
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println();
        Iterator i1=s1.iterator();
        while(i1.hasNext()) {
        	System.out.println(i1.next());
        }
        }

}

