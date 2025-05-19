package Day_4;
class Chocolate{
	void ate() {
		System.out.println("yes");
	}
}
class Dark extends Chocolate{
	void taste1() {
		System.out.println("full tasty");
	}
}
class Sweet extends Chocolate{
	void taste2() {
		System.out.println("not tasty");
	}
}
class Bournvelli extends Dark{
	void cost1() {
		System.out.println("20 per 10");
	}
}
class Amul extends Dark{
	void cost2() {
		System.out.println("10 per 1");
	}
}
class Dairymilk extends Sweet{
	void weight1() {
		System.out.println("1kg per 1");
	}
}
class Kitkat extends Sweet{
	void weight2() {
		System.out.println("2kg per 2");
	}
}

public class Demo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dairymilk d1 =new Dairymilk();
		Kitkat k1=new Kitkat();
		Bournvelli b1=new Bournvelli();
		Amul a1=new Amul();
		d1.weight1();
		k1.weight2();
		b1.cost1();
		a1.cost2();
		b1.taste1();
		d1.taste2();
		d1.ate();

	}

}
