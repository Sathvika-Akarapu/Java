package Day_2;//print prime num from 1-20 using for loop
//print list of names using for each loop

public class Scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"ammu","ravi","ramu"};
		for(String x:a) {
			System.out.println(x);
		}
		System.out.println("The  prime numbers between 1 and 20 are");
		System.out.println("2");
		System.out.println("3");
		for(int i=4;i<=20;i++) {
			if(i%2==0) {
				continue;
			}
			if(i%3==0) {
				continue;
			}
			System.out.println(i+" ");
		}
		System.out.println();
		

	}

}
