package Day_5;
//static inner class
class Sample22{
	private static void show() {
		System.out.println("hey");
	}
	static class Test23{//static class allows only sttaic methods
		static void print() {
			System.out.println("hi");
			show();
		}
	}
}

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample22.Test23.print();
	
		

	}

}
