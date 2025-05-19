package Day_5;
class Demo9{
	void show() {
		System.out.println("Hi");
	}
}

public class Sample8 {
	Demo9 d1=new Demo9() {//Anynomous class(with the help of object reference JVM knows which class is invoked
		void show() {
			System.out.println("Hello");
			super.show();
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample8 s1=new Sample8();
		s1.d1.show();

	}

}
