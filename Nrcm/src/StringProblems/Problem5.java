package StringProblems;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="hello";
		String n="";
		for(int i=m.length()-1;i>=0;i--) {
			n+=m.charAt(i);
		}
		if(m.equals(n)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}


	}

}
