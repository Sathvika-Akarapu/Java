package Day_3;

abstract class Test3 {
	abstract void add();
	abstract void sum();
}
class demo9 extends Test3{
	public void add() {
		System.out.println("hi");
	}
	public void sum() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo9 d1=new demo9();
		d1.add();
		d1.sum();

	}

}




