package Day_2;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=33;
		if(a%2==0) {
			if(a<=10) {
				System.out.println("less than 10");
			}
		}
		else {
			if(a%3==0) {
				if(a>=10) {
					System.out.println("divisble by 3");
				}
				else {
					if(a<0) {
						System.out.println("negative number");
					}
					else {
						System.out.println("positive number");
					}
				}
			}
		}
		

	}

}
