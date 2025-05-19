package Day_4;
interface I1{
	void add();
	void sub();
}

public class Demo30 implements I1{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo30 d1=new Demo30();
		d1.add();
		d1.sub();

	}

}
