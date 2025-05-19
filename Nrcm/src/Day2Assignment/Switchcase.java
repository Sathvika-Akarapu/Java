package Day2Assignment;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String color=sc.next();
		String action;
		switch(color) {
		case "red":
			action="stop";
			break;
		case "yellow":
			action="caution";
			break;
		case "green":
			action="go";
			break;
		default:
			action="invalid";
			break;
		}
		System.out.println(action);
		

	}

}
