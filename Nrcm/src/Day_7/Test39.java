package Day_7;

public class Test39 {
	static void add(int a,int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("maths radha niku");
		}
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			add(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Bye");
		}

	}

}
