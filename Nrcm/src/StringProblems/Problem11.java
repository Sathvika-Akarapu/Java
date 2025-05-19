package StringProblems;
//non repeating charachters in a string and its count

public class Problem11 {

	public static void main(String[] args) {
		String a="Hello";
		int count=0;
	
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(a.indexOf(ch)==a.lastIndexOf(ch)) {//indexof-tellls the frst place appear on string and lastindex tells last place if both postions are same it means it appears only once
				System.out.print(ch +"");
				count++;
			}
		}
		System.out.print(count + "");
		// TODO Auto-generated method stub

	}

}
