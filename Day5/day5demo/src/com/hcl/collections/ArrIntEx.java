package com.hcl.collections;
/**
 * ArrayList is imported.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx { 
  /**
   * main method is created.
   */

  public static void main(String[] args) { 
    List num = new ArrayList();
    num.add(new Integer(44));
    num.add(new Integer(67));
    num.add(new Integer(60));
    num.add(new Integer(65));
    num.add(new Integer(35));
    num.add(new Integer(4));
    int sum = 0;
    for (Object object : num) {
      sum += (Integer)object;
    }
    System.out.println("sum= " + sum);

  }

}
