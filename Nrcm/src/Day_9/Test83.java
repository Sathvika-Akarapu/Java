package Day_9;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test83 {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(2);
		q1.offer(22);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
	}

}

