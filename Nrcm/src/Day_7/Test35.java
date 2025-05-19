package Day_7;
import java.util.*;
//if we dont use try catch it will show an error by only using throws

public class Test35 {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException|InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}

}
