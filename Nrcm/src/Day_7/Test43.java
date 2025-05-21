package Day_7;

public class Test43 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test43 t5=new Test43();
		Thread t6=new Thread(t5);
		t6.start();
		System.out.println(t6.getName());
		System.out.println(t6.getState());
		Thread t7=new Thread();
		t7.start();
		System.out.println(t7.getName());

	}

}
