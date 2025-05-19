package Day_7;


import java.util.*;

public class Test34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException|InputMismatchException e)
		//if we want to handle more than one exception in single catch block we use | pipe symbol
		{
			System.out.println(e.getMessage());
		}
		//catch(InputMismatchException e) {
		//	System.out.println(e.getMessage());
		//}
		// TODO Auto-generated method stub
		finally {
			System.out.println("Hi");
		}

	}

}
