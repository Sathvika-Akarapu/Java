package StringProblems;
import java.util.Scanner;
//substring from the user given index

public class Problem7 {

	public static void main(String[] args) {
		String k="hello";
		System.out.println("enter the indices");
		Scanner sc =new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		if(start>=0&&end<=k.length()&&start<end) {
			String sub=k.substring(start, end);
			System.out.println("the substring is " + sub );
		}
		else
		{
			System.out.println("invalid indices");
		}
	}

}
