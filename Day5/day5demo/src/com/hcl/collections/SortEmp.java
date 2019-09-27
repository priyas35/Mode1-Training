package com.hcl.collections;
/**
 * comparator is imported.
 */

import java.util.Comparator;
/**
 * SortedSet is imported.
 */

import java.util.SortedSet;
/**
 * TreeSet is imported.
 */

import java.util.TreeSet;

public class SortEmp {
  /**
   * main method is created.
   */

  public static void main(String[] args) {
    SortedSet lstnames = new TreeSet();
    lstnames.add(new Emp(1, "anisha", 765767.76));
    lstnames.add(new Emp(2, "anu", 767.76));
    lstnames.add(new Emp(3, "sidhu", 7676));
    lstnames.add(new Emp(4, "achu", 98967.76));
    lstnames.add(new Emp(5, "ram", 875767.76));
    System.out.println("sorted data");
    lstnames.forEach(System.out::println);
  }

}
