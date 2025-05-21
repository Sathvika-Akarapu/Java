package Filesjava;
import java.io.*;

public class Test51 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\sathvika\\OneDrive\\Desktop\\sem.txt");
		if(f1.createNewFile()) {
			System.out.println("File created successfully");
		}else {
			System.out.println("not created");
		}

	}

}
