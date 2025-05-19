package Day_5;

public class Sample5 {
	void show() {
		System.out.println("hi");
	}
	class Test5{//nested class
		void print() {
			System.out.println("hello");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sample5 s1=new Sample5();
        s1.show();
        Sample5.Test5 t1=new Sample5().new Test5();//object creation for nested class
        t1.print();
	}

}
