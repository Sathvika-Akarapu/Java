package Day2Assignment;
import java.util.*;

public class Conditioanlstatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		int monthlyIncome=sc.nextInt();
		int creditScore=sc.nextInt();
		System.out.println("Loan eligibility Result");
		//if(age<21||age>60) {
		//	System.out.println("Not eligible:Age must be between 21 and 60");
		//}
		if(age>=21 && age<=60 && monthlyIncome>=30000 &&creditScore>=750) {
			System.out.println("Elgible");
		}
		else {
			System.out.println("Not eligible:Age must be between 21 and 60");
		}
		
	}

}
