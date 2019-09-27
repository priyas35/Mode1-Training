package com.hcl.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjInEx {
	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("C:/file/objout.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
		    String s=(String)objin.readObject();
		    Date d=(Date)objin.readObject();
		    System.out.println(s+d);
		    objin.close();
		    fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
