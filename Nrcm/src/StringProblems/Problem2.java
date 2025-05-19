package StringProblems;
//duplicate charchters in a string

public class Problem2 {

	public static void main(String[] args) {
		String p="Hello";
		String b="";
	
		for(int i=0;i<p.length();i++) {
			char ch=p.charAt(i);
			
			if(b.indexOf(ch)!=-1) {
				continue;
			}
			int count=0;
			for(int j=0;j<p.length();j++) {
				if(ch==p.charAt(j)){
					count++;
				}
			}
			if(count>1) {
				b+=ch;
				System.out.println(count +"");
				
				
			}
			
		}
		System.out.println("Duplicate charachters are:"+ b);
	
		// TODO Auto-generated method stub

	}

}
