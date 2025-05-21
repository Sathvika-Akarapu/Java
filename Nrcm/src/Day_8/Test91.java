package Day_8;

public class Test91 extends Thread{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test91 t1=new Test91();
		System.out.println("hello");
		t1.start();
	}

}
