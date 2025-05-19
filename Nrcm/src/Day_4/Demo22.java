package Day_4;
class Bike{
	void speed() {
		System.out.println("250km per hour");
	}
}
class Bmw extends Bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class Model extends Bmw{
	void price() {
		System.out.println("25000 per bike");
	}
}

public class Demo22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m1=new Model();
		m1.price();
		m1.rev();
		m1.speed();

	}

}
