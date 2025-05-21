package Day_7;
class OwnException extends Exception{
	public OwnException(String message) {
		super(message);
	}
	
	
}
public class Test40 {
	public  static void ageCheck(int age) throws OwnException{
	if(age>18) {
		throw new OwnException("No");
		
		
		
	}else {
		System.out.println("My age is 18 below");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ageCheck(24);
		}catch(OwnException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy coding");
		}

	}

}
