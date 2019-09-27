package com.hcl.demo;

import java.text.DateFormat;
import java.text.NumberFormat;import java.util.Date;
import java.util.Locale;

public class Demo {
public static void main(String[] args) {
	

	double d=63437.54;
	NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
	NumberFormat nf1=NumberFormat.getInstance(Locale.US);
	NumberFormat nf2=NumberFormat.getInstance(Locale.CHINA);
	System.out.println("Italy Representation of "+d+":"+nf.format(d));
	System.out.println("US Representation of "+d+":"+nf1.format(d));
	System.out.println("China Representation of "+d+":"+nf2.format(d));
	
	DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("ja","JA"));
	System.out.println("short format of date: "+df.format(new Date()));

}


}