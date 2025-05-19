package Day_2;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		//String color="orange";
	    String color=args[0];//using command line arguments
		//Scanner sc=new Scanner(System.in);//using scanner class for user input
		//System.out.println("enter the color");
		//String color=sc.next();
		switch(color) {
		case "red":
			System.out.println("Holi");
			break;
		case "orange":
			System.out.println("ramzan");
			break;
		case "white":
			System.out.println("Christmas");
			break;
		default:
			System.out.println("no festival");
		}

	}

}
