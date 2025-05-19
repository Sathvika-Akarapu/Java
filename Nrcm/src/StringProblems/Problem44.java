package StringProblems;

public class Problem44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String e="hello";
		String  f="";
		int lastIndex=e.length()-1;
		while(lastIndex>=0) {
			f+=e.charAt(lastIndex);
			lastIndex--;
		}
		System.out.println("" + e);
		System.out.println(" "+ f);

	}

}
