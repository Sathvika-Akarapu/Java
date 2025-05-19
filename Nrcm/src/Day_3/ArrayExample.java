package Day_3;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,3,4,5,6,7,7};
		int a1[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				a1[index++]=a[i];
			}
		}
		System.out.println("No repeated");
		for(int i=0;i<index;i++) {
			System.out.print(a1[i] + " ");
		}

	}

}
