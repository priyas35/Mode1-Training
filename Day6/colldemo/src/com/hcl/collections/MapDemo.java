package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map m= new HashMap();
		m.put("priya", "darshini");
		m.put("Laksh","Laksh");
		m.put("rishab", "hcl");
		m.put("kiruba","Lakshmi");
		String key="priya";
		String value=(String)m.getOrDefault(key, "not found");
		System.out.println(value);
	}

}
