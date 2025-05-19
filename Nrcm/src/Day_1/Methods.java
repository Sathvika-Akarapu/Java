package Day_1;

public class Methods {
	int a=1,b=2;
	static int c=3,d=4;
	void div() {
		int p=9,q=8;
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(p+q);
	}

	static void show() {
		int e=6,f=4;
		//static method does not allow instance variables
		System.out.println(c+d);
		System.out.println(e+f);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m1=new Methods();
		m1.div();
		show();//same class ,so directly calling by using method name
		       //if different call by using class name

	}

}
