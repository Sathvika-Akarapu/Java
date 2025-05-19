package Day_5;
//method local inner class
public class Sample6 {//outer class
	void show() {//outer method
		System.out.println("Good Afternoon");
		class Test6{//inner class
			void print() {//inner method
				System.out.println("Hi");
			}
		}
		Test6 t7=new Test6();
		t7.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample6 s1=new Sample6();
		s1.show();

	}

}
