package Day_4;
class Sample34{
	int m=77;
}

public class Demo36 extends Sample34{
	void show() {
		int y=99;
		System.out.println(super.m);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo36 d1=new Demo36();
		d1.show();

	}

}
