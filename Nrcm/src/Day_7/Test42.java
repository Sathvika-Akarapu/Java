package Day_7;

public class Test42 extends Thread {

	public static void main(String[] args) {
		Test42 t1=new Test42();//thread is created
		Test42 t2=new Test42();
		t1.start();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getState());

	}

}
