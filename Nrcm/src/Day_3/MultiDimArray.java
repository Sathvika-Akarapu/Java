package Day_3;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a1= {{2,3,4,5},{5,6,7,8}};
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j< a1[0].length;j++) {
				System.out.print(a1[i][j]);
			}
			System.out.println();
		}

	}

}
