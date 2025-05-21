package Filesjava;
import java.io.*;
//if the file is not present filewriter will create and append the data at a time

public class Test52 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f1=new FileWriter("C:\\Users\\sathvika\\OneDrive\\Desktop\\sem2.txt");
		f1.write("Hi, How are you");
		f1.close();
		System.out.println("success");
	}

	}


