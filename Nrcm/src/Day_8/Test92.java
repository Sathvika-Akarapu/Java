package Day_8;

public class Test92 implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test92 t2=new Test92();
		t2.run();
		System.out.println("hello");
		Thread t3=new Thread();
		t3.start();

	}

}
