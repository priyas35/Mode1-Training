package com.hcl.ex;
/**
 * this is a main entry point and class starts.
 */

public class ThrEx {

  /**
   * show method checks the positive and negative numbers.
   * @param x the list of arguments.
   */

  public void show(int x) { 
    
    boolean flag = true;
    if (x < 0) { 
      flag = false;
      throw new 
      NumberFormatException("negative nos not allowed");
    }
    if (x == 0) { 
      flag = false;
      throw new ArithmeticException("zero is invalid");
    }
  }
  /**
   * The main entry point.
   */
  
  public static void main(String[] args) {  
  
    int n = -12;
    try {
      new ThrEx().show(n);
    } catch (NumberFormatException e) {  
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) {  
      System.out.println(e.getMessage());
    } catch (Exception e) {  
      e.printStackTrace();
    }
  }
}
