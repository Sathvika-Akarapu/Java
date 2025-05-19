package Day_3;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		//int a[]=new int[a.length];//creating a new array by using existing arrray
		/*for(int x:a) {
			System.out.println(x);
		}*/
		//for(int i=0;i<a.length;i++)
		/*for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}*/
		/*int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
		}
		System.out.println(count);*/
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
//program to print the value with given index
