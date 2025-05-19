package Day_4;
//main method can be overloaded in java using compile time polymorphism

public class Demo27 {
	public static void main() {
		System.out.println("hii");
	}
	public static void main(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo27 d1=new Demo27();
		d1.main();
		d1.main(2,3);

	}

}
