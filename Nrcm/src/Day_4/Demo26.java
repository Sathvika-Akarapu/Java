package Day_4;
//method overloading-compile time(same class,same method with different parameters

public class Demo26 {
	void show() {
		System.out.println("Good Morning");
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1,String s2) {
		System.out.println(s1.concat(s2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo26 d1=new Demo26();
		d1.show();
		d1.show(1, 3);
		d1.show(2.3,3.5);
		d1.show("abc", "xyz");

	}

}
