package com.hcl.ex;

/**
 * custom class is created.
 */

public class Custom {
  /**
    * sum method is called.
    * @param a is called.
    * @param b is called.
    * @throws NumberZeroException is found.
    */
  public void sum(int a,int b) throws NumberZeroException,NegativeException { 
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) { 
      flag = false;
      throw new NegativeException("negative nos not allowed");
    }
    if (a == 0 || b == 0) { 
      flag = false;
      throw new NumberZeroException("zero is invalid");
    }
    if (flag == true) { 
      c = a + b;
      System.out.println("sum is " + c);
    }
  }
  /**
   * this is a main method.
   */

  public static void main(String[] args) { 
    int a = 5;
    int b = -12;
    try {
      new Custom().sum(a, b);
    } catch (NumberZeroException | NegativeException e) { 
      e.printStackTrace();
    }
  }

}
