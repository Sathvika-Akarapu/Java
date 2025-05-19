package Day_1;

public class LogicalVar {
		int a =2,b=3;
		static int c=4,d=1;
		void and() {
			System.out.println(a>b&&a<b);
		}
		void or() {
			System.out.println(c>d||c<d);
		}
		void not() {
			int e=8,t=8;
			System.out.println(e!=t);
		}
		public static void main(String[] args) {
			 LogicalVar v1=new  LogicalVar();
			 v1.and();
			 //System.out.println((v1.a<v1.b)&&(v1.a<v1.b))
			 v1.or();
			//System.out.println((Variables.a<Variables.b)||(Variables.a>Variables.b))
			 v1.not();
		}

	}


