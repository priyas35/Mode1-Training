package com.hcl.collections;

public class Emp implements Comparable { 
  int empno;
  String name;
  transient double basic;
  /**
   * Constructor is created.
   * @param empno is created.
   * @param name is created.
   * @param basic is created.
   */

  public Emp(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
  /**
   * calls the toString method. 
   */
  
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  /**
   * {@link Comparable} is created.
   */
  
  public int compareTo(Object o) {
    Emp e = (Emp)o;
    return name.compareTo(e.name);
  }

}
