package StringProblems;
//to find out the charachter at index poistion

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g="hello";
		System.out.println("enter the index postion");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		if(t>=0&&t<g.length()) {
			char ch=g.charAt(t);
			System.out.println("charachter at index postion is:"+ch);
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
