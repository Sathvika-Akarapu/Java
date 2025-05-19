package StringProblems;
//reverse of a string
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="hello";
		String n="";
		for(int i=m.length()-1;i>=0;i--) {
			n+=m.charAt(i);
		}
		System.out.println("orginal string is: " + m);
		System.out.println("reversed string is: "+ n);
	}

}
