package Day_8;
class Test31 extends Thread{
	public void run() {
		System.out.println("I");
	}
}
class Test32 extends Test31{
	public void run() {
		System.out.println("am");
	}
}
class Test33 implements Runnable{
	public void run() {
		System.out.println("your");
	}
	
}
class Test34 extends Test33{
	public void run() {
		System.out.println("enemy");
	}
}

public class Test96 {

	public static void main(String[] args) {
		Test31 t3=new Test31();
		t3.start();//i
		Test32 t4=new Test32();
		t4.start();//am
		Test33 t5=new Test33();
		Test34 t6=new Test34();
		
		
		
		Thread t1=new Thread(t5);//your
		Thread t2=new Thread(t6);//enemy
		t1.start();
		t2.start();
		

	}

}
