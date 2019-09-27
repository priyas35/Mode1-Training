package com.hcl.files;
/**
 * file is imported.
 */

import java.io.File;
/**
 * FileInputStream is imported.
 */

import java.io.FileNotFoundException;
/**
 * FileReader is imported.
 */

import java.io.FileReader;
/**
 * FileWriter is imported.
 */

import java.io.FileWriter;
/**
 * IOException is imported.
 */

import java.io.IOException;

public class FileWrite {
	
	public static void main(String[] args) {
		File src,tar;
		FileReader fr;
		FileWriter fw;
		src=new File("C:/hcljava/Day4/project4/src/com/hcl/ex/Custom.java");
		tar=new File("C:/file/custom.java");
		try {
			fr=new FileReader(src);
			fw=new FileWriter(tar);
			int ch;
			while((ch=fr.read()) != -1){
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("file copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
