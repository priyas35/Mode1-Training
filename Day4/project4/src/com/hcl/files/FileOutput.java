package com.hcl.files;
/**
 * FileInputStream is imported.
 */

import java.io.FileInputStream;
/**
 * FileNotFoundException is imported.
 */

import java.io.FileNotFoundException;
/**
 * FileOutputStream is imported.
 */

import java.io.FileOutputStream;
/**
 * IOException is imported.
 */

import java.io.IOException;
/**
 * class is created.
 */

public class FileOutput {
  /**
   * main method is created.
   */

  public static void main(String[] args) { 
    FileInputStream src;
    FileOutputStream tar;
    try {
      src = new FileInputStream("C:/hcljava/Day4/project4/src/com/hcl/ex/Custom.java");
      tar = new FileOutputStream("C:/file/custom.java");
      int ch;
      while ((ch = src.read()) != -1) { 
        tar.write((char)ch);
      }
      src.close();
      tar.close();
      System.out.println("*** File copied ***");
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }

}
