package Day_3;
abstract class Test4{
	abstract void add();
	abstract void sub();
	static void mul() {
		System.out.println("Multiplication");
	}
}
class Demo4 extends Test4{
	public void add() {
		System.out.println("addition");
	}
	public void sub() {
		System.out.println("substraction");
	}
	void div() {
		System.out.println("division");
	}
	void mod() {
		System.out.println("modulus");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d1=new Demo4();
		d1.add();
		d1.sub();
		Test4.mul();
		d1.div();
		d1.mod();

	}

}
