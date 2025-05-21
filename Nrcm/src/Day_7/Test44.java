package Day_7;

public class Test44 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test44 t9=new Test44();
		Thread t3=new Thread();
		t3.start();
		System.out.println("Hi");
		t3.sleep(20000);
		System.out.println("hello");

	}

}
