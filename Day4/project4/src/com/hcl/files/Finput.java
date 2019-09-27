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
 * IOException is imported.
 */

import java.io.IOException;

public class Finput { 
  /**
   * main method is created.
   */
  public static void main(String[] args) {
    try {
      FileInputStream fin = 
          new FileInputStream("C:/hcljava/Day4/project4/src/com"
          + "/hcl/ex/Custom.java");
      int ch;
      while ((ch = fin.read()) != -1) { 
        System.out.print((char)ch);
      }
      fin.close();
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }

}
