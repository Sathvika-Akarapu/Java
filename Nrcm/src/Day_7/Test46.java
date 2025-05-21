package Day_7;
import java.util.*;

public class Test46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the class name");
			String className=sc.next();
			Class.forName(className);
			System.out.println("class is found");
		}catch(ClassNotFoundException e) {
			System.out.println("class not found"+ e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
