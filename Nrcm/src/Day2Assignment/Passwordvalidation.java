package Day2Assignment;

import java.util.Scanner;

public class Passwordvalidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your password");
		String p=sc.nextLine();
		if(p.length()!=8) {
			System.out.println("Error:Length must be 8.");
		}
		if(p.isEmpty()) {
			System.out.println("It should start with capital letter");
		}
		if(p.length()>=1 && !Character.isUpperCase(p.charAt(0))) {
			System.out.println("error,it must start with capital letter");
		}
		boolean hasSpecial=false;
		if(!hasSpecial) {
			for(int i=0;i<=p.length();i++) {
				char ch=p.charAt(i);
				if(!Character.isLetterOrDigit(ch)) {
					hasSpecial=true;
					break;
				}
			}
			if(!hasSpecial) {
				System.out.println("It should contain special symbol");
			}
		}
		boolean hasDigit=false;
		for(int i=0;i<=p.length();i++) {
			if(Character.isDigit(p.charAt(i))) {
				hasDigit=true;
			}
		}
		if(!hasDigit) {
			System.out.println("Must contain a number");
		}
		System.out.println("password is valid");

	}

}
