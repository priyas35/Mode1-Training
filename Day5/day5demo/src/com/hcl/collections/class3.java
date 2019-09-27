package com.hcl.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class class3 {
  public static void main(String[] args) {
	FileWriter fw;
	try {
		fw = new FileWriter("C:/file/data.txt");
		fw.write("12 ram 12.4 66.97 bus van 85 98.7656");
		fw.close();
		FileReader fr=new FileReader("C:/file/data.txt");
		Scanner sc=new Scanner(fr);
		while(sc.hasNext()){
			if(sc.hasNextInt()){
				System.out.println(sc.nextInt());
			}else{
				sc.next();
			}
		}
		sc.close();
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
