package Day_5;


public class Sample1 {
	int a=89;
	void add() {
		int a=89;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 d1=new Sample1();
		d1.sub();

	}

	

}
