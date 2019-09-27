package com.hcl.ex;

import java.io.FileInputStream;
/**
 * class CliMain provides the command line interface 
 */
import java.io.FileNotFoundException;
/***
 * The main entry point
 * @param args the list of args
 * @throws FileNotFoundException throw FileNotFoundException
 *
 */

public class ChkDemo { 
  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream f1 = new FileInputStream("c:/hello.txt");
  }

}
