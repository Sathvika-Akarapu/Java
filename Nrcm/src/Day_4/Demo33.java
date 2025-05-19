package Day_4;
interface I6{
	void add();
}
interface I7{
	void sub();
}
interface I8 extends I6,I7{
	public void mul();
}
public class Demo33 implements I8 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void mul() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo33 d1=new Demo33();
		d1.add();
		d1.sub();
		d1.mul();

	}

}
