package Day_4;
interface I11{
	void add();
}
interface I12 extends I11{
	void sub();
}
class Test1 implements I12{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("Hello");
	}
	public void mul() {
		System.out.println("welcome");
	}
     
}
class Test2 implements I12{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("Hello");
	}
	public void div() {
		System.out.println("welcome2");
	}
	
}

public class Demo34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		t1.add();
		t1.sub();
		t1.mul();
		t2.add();
		t2.sub();
		t2.div();
		
	}

}
