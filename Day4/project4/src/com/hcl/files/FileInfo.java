package com.hcl.files;
/**
 * file is imported.
 */

import java.io.File;
/**
 * this is a main class.
 * 
 */

public class FileInfo {
  /**
   * main function is created.
   */

  public static void main(String[] args) {
    File f1 = new File("C:/hcljava/Day4/project4/src/com/hcl/ex/Custom.java");
    System.out.println("fileName" + f1.getName());
    System.out.println("full name " + f1.getAbsolutePath());
    File f2 = new File("C:/hcljava/Day4/project4/src/com/hcl/ex");
    String[] files = f2.list();
    for (String s : files) { 
      System.out.println(s);
    }
  }

}
