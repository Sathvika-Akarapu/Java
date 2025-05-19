package Day_3;

public class Strings {

	public static void main(String[] args) {
		//String s1="Queen";//Literals,so they are stored in SCP memory
		//String s2="Queen";
		String s5="Kirthi";
		String s4="Sathvika";
		//System.out.println(s1.equals(s2));//used to compare original content
		//System.out.println(s1==s2);//used to compare memory (object)references
		//System.out.println(s3.equals(s4));
		//System.out.println(s3==s4);
		//System.out.println(s2.equals(s4));
		System.out.println(s5.compareTo(s4));//uses lexicographical analysis which means it checks the frst letter
		                                       //and give the difference of frst letters based onn the condition s1<s2-negative value;s1>s2-positive value;s1==s2:0
	}

}
