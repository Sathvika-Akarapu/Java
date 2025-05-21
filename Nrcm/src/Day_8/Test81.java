package Day_8;

public class Test81 extends Thread {
	String s;
	public Test81(String name) {
		s=name;
		
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s + "is Daemon Thread");
		}else {
			System.out.println(s + "is user Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test81 thread1=new Test81("thread1");
		Test81 thread2=new Test81("thread2");
		Test81 thread3=new Test81("thread3");
		thread1.setDaemon(true);//set user thread1 to daemon
		thread1.start();//starting thread1
		thread2.start();
		thread3.setDaemon(false);///set user thread1 to daemon
		thread3.start();//starting thread
		

	}

}
