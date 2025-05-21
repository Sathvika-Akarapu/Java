package Day_9;
import java.util.Arrays;

public class Test80{

	public static void main(String[] args) {
		int[] arr= {1,2,11,4,5};
		Arrays.sort(arr);
		int a=Arrays.binarySearch(arr, 2);// it will give the index postion of 2
		System.out.println(a);
		for(int b1:arr) {
			System.out.println(b1);
			
		}

	}

}

