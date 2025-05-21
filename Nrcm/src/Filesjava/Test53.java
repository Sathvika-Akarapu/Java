package Filesjava;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File Obj=new File("C:\\Users\\sathvika\\OneDrive\\Desktop\\sem2.txt");
			Scanner R=new Scanner(Obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);
			}
			R.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
