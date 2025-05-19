package Day_4;
//single inheritance(single parent class extends single child class)
//file name should be same as main class name
//main class name should be public 
class Animal{
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
}

public class Demo21 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.bark();
		d1.sleep();

	}

}
