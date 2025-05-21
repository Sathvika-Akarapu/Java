package Day_8;
//the no of threads we create that many number of threads are running irrespective of objects created

public class Test93 implements Runnable {
	public void run() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test93 t4=new Test93();
		//Test93 t5=new Test93();
		//if we pass same object to 2 different threads then both the threads will run becoz 2 start()
 	Thread p1=new Thread(t4);
		//Thread p2=new Thread(t5);
		Thread p2=new Thread(t4);
		
		System.out.println("Hello");
		p1.start();
		p2.start();
		//if we comment 2 thread classes and call t4.run and t5.run it will give me output but it is normal program

	}

}
