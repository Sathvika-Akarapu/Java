package Day_7;

public class Test45 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test45 t8=new Test45();
		Thread t7=new Thread();
		System.out.println("hi");
		try {
			t7.sleep(20000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hello");

	}

}
