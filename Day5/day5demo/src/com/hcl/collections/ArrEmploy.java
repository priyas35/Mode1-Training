package com.hcl.collections;
/**
 * ArrayList is imported.
 */

import java.util.ArrayList;
/**
 * List is imported.
 */

import java.util.List;

public class ArrEmploy {
  
  /**
   * main method is created.
   */

  public static void main(String[] args) {
    List lstnames = new ArrayList();
    lstnames.add(new Employ(1, "anisha", 765767.76));
    lstnames.add(new Employ(2, "anu", 76787777.76));
    lstnames.add(new Employ(3, "sidhu", 7676));
    lstnames.add(new Employ(4, "achu", 98967.76));
    lstnames.add(new Employ(5, "ram", 875767.76));
    for (Object object : lstnames) { 
      Employ e = (Employ)object;
      System.out.println(e);
    }
  }

}
