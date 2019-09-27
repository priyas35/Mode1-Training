package com.hcl.ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutput {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("C:/file/objout.txt");
		    ObjectOutputStream objout=new ObjectOutputStream(fout);
		    objout.writeObject(new String("date is: "));
		    objout.writeObject(new Date());
		    objout.close();
		    fout.close();
		    System.out.println("object selected");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
