package Day_9;
import java.util.*;

public class Test85 {

	public static void main(String[] args) {
	    Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
	    m1.put(2, "cse");
	    m1.put(4,"ece");
	    m1.put(1,"ds");
	    m1.put(3,"eee");
	    m1.put(6,"mech");
	    m1.put(5,"civil");
	    System.out.println(m1);
	    for(Map.Entry<Integer, String> i:m1.entrySet()) {
	    	System.out.println(i.getValue());
	    	System.out.println(i.getKey());
	    	
	    }

	}

}

