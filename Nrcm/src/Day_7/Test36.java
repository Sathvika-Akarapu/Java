package Day_7;
//import java.io.File;
import java.io.*;
import java.util.Scanner;


public class Test36 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File Obj=new File("C:\\Users\\sathvika\\OneDrive\\Desktop\\java.txt.txt");
		Scanner Reader=new Scanner(Obj);
		       while(Reader.hasNextLine()) {
		String data=Reader.nextLine();
		   System.out.println(data);
		    //throw new FileNotFoundException("file not seen");
	}
	Reader.close();
	}

}
