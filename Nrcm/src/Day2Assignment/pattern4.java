package Day2Assignment;

public class pattern4 {

	public static void main(String[] args) {
		int n=5;
		//System.out.println("right angled triangle is");
		//for(int i=1;i<=5;i++) {
			//for(int j=1;j<=i;j++)
			//{
				//System.out.print("*");
			//}
			//System.out.println("");
		//}
		//System.out.println("");
		System.out.println("left angled triangle is");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.println(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
