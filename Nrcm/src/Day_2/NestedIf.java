package Day_2;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a =9;//doesnt give the output becoz frst condition itself is false
		int a=12;
		if(a%2==0) {
			System.out.println("Satisfy");
			if(a%3==0) {
				System.out.println("multiple of 3");
			}
			else {
				System.out.println("not multiplied by 3");
			}
			if(a<=10) {
				System.out.println("less than 10");
			}
			else {
				System.out.println("Greater than 10");
			}
		}

	}

}
