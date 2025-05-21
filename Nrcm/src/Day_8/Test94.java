package Day_8;
class Test44 extends Thread{
	public void run() {
		System.out.println("hi");
	}
}
class Test45 extends Thread{
	public void run() {
		System.out.println("Hello");
	}
}

public class Test94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test44 t5=new Test44();
		Test45 t6=new Test45();
		t5.start();
		t6.start();

	}

}
