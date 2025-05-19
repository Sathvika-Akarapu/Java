package Day_2;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=16;
		if(a%2==0) {
			System.out.println("divisible by 2");
		}
		else {
			if(a%3==0) {
				System.out.println("divisble by 3");
			}
			else {
				System.out.println("not divisible");
			}
		}
	}
}

