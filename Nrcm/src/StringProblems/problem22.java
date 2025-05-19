package StringProblems;
//duplicate charachters in a string

public class problem22 {

	public static void main(String[] args) {
		String x="Hello";
		String y="";
		int count=0;
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			if(x.indexOf(ch)!=x.lastIndexOf(ch)&&x.indexOf(ch)==i) {
				System.out.println(" "+ ch);
				count++;
			}
		}
		System.out.println("count is " + count);
		// TODO Auto-generated method stub

	}

}
