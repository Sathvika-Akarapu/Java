package Day_9;
import java.util.*;
public class Test84 {

	public static void main(String[] args) {
	    Map<Integer,String> m1=new HashMap<Integer,String>();
	    m1.put(1, "cse");
	    m1.put(2,"ece");
	    m1.put(3,"ds");
	    m1.put(4,"eee");
	    m1.put(5,"mech");
	    m1.put(6,"civil");
	    System.out.println(m1);
	    for(Map.Entry<Integer, String> i:m1.entrySet()) {
	    	System.out.println(i.getValue());
	    	System.out.println(i.getKey());
	    	
	    }

	}

}
