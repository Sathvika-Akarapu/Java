package Day_5;

public class Sample10 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("hi");
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			//System.out.println(e);
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
			//the above are the 3 different ways to print the output
		}
		// TODO Auto-generated method stub

	}

}
