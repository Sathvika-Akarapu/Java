package StringProblems;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		String v="hello";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charachter");
		String c=sc.next();
		int index=v.indexOf(c);
		if(index!=-1) {
			String sub=v.substring(index);
			System.out.println("substring is" + sub);
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
