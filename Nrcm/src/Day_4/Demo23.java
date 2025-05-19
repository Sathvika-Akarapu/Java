package Day_4;
class Fruits {
	void Benefits() {
		System.out.println("healthy");
	}
}
class Apple extends  Fruits{
	void color() {
		System.out.println("red");
	}
}
class Mango extends Fruits{
	void price() {
		System.out.println("100 kg");
	}
}
class Banana extends Fruits{
	void taste() {
		System.out.println("sweet");
	}
}

public class Demo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1=new Apple();
		Mango m1=new Mango();
		Banana b1=new Banana();
		a1.Benefits();
		a1.color();
		m1.Benefits();
		m1.price();
		b1.Benefits();
		b1.taste();

	}

}
