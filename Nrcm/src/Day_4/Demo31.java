package Day_4;
//2 interfaces implementing 1 class - in this way we can acheive multiple inheritance using interface
interface I44{
	void add();
}
interface I2{
	void sub();
}
public class Demo31  implements I44,I2{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("Hello");
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo31 d1=new Demo31();
		d1.add();
		d1.sub();
	}
	

}
