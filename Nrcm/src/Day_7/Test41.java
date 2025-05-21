package Day_7;
//user defined Exceptions
class Sathvika extends Exception{
	public Sathvika(String message) {
		super(message);
	}
	
	
}
public class Test41 {
	public  static void mathsFobia(int n) throws Sathvika{
	if(n%2==0) {
		throw new Sathvika("Naku Maths ochu");
		
		
		
	}else {
		System.out.println("naku maths ochu kani radhu anipisthundi");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			mathsFobia(24);
		}catch(Sathvika e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Maths kastame");
		}

	}

}
