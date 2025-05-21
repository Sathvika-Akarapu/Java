package Day_8;
class Test3 extends Thread{
	public void run() {
		System.out.println("hi");
	}
	
}
class Test4 implements Runnable{
	public void run() {
		System.out.println("Good");
	}
	
}

public class Test95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t5=new Test3();
		Test4 t6=new Test4();
		t5.start();
		Thread t7=new Thread(t6);
		t7.start();

	}

}
