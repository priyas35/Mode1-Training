package com.hcl.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		
		String strDate="09/03/2019";
		try {
			Date obj=sdf.parse(strDate);
			System.out.println(obj);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
