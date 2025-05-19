package Day_4;
class Movie{
	void action() {
		System.out.println("super");
	}
}
class Hit extends Movie{
	void Genre() {
		System.out.println("suspense");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("Nani");
	}
}
class Heroine extends Hit{
	void sex() {
		System.out.println("female");
	}
}

public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1=new Hero();
		Heroine  h2=new Heroine();
		h2.sex();
		h1.name();
		h1.Genre();
		h1.action();

	}

}
