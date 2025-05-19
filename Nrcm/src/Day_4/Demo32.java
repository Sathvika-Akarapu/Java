package Day_4;
interface I3{
	void add();
}
class Test56{
	void sub() {
		System.out.println("hello");
	}
}
public class Demo32 extends Test56 implements I3 {
	public void add() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo32 d1=new Demo32();
		d1.sub();
		d1.add();

	}

}
