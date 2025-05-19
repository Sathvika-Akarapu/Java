package StringProblems;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="";
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			int count=0;
			for(int j=0;j<a.length();j++) {//it goes to the string again and checks each charachter ch and compare it to every other charachter
				if(ch==a.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				b+=ch;
			}
		}
		System.out.println("Non repeated charachter:" + b);
	}


}
