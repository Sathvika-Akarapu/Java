package Day_3;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="helloworld";
     
        int count=0;
        for(int i=0;i<s1.length();i++){
        	char ch=s1.charAt(i);
        	if(ch=='l') {
        		count++;
        	}
        }
        System.out.println(count);
        
	}

}
