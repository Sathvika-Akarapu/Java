package Day_8;

public class Test99 implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t7=new Thread(new Test99());//inside of constructor we are creating object for test class
		t7.start();

	}

}
