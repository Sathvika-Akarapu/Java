package Day_3;

public class StringProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Helloworld";
		//sepearte all the vowels and consonants
		//int vowels=0;
		//int consonants=0;
		String vowels="";
		String consonants="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowels+=ch;
			else if(ch>='a'&&ch<='z') consonants+=ch;
		}
		System.out.println("Vowels: " + vowels + ",consonants: " + consonants + "");
		
		//count means we have to use vowels++ and consonats++ with int vowels and consonants=0

	}

}
