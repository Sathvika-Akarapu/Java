package Day_1;

public class ArthimeticVar {
	int a =1,b=3;//instance
	static int c=9,d=5;//static
	void mod() {
		System.out.println(a%b);
	}
	void mul() {
		System.out.println(c*d);
	}
	void div() {
		int x=8,y=9;//local
		System.out.println(x/y);
	}

	public static void main(String[] args) {
		 ArthimeticVar a = new  ArthimeticVar();
		 a.mod();
		 a.mul();
		 a.div();
		

	}

}
