package Day_4;
class Sample45{
	public Sample45() {
		System.out.println("Good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}


public class Demo35 extends Sample45 {
	public Demo35() {//calling constructor using super 
		super();
		
	}
	void show() {
		int y=45;
		super.print();//calling method using super
		System.out.println(super.x);//calling variable using super
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo35 d1=new Demo35();
		d1.show();

	}

}
