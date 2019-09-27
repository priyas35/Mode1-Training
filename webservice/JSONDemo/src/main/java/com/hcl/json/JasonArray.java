package com.hcl.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;  
public class JasonArray{    
public static void main(String args[]){  
	
	JSONObject o=new JSONObject();
	for(int i=0;i<2;i++){
		JSONArray arr = new JSONArray(); 
		arr.add("Emp" +i);    
		  arr.add(1000*i);    
		  arr.add(25+i);  
		  o.put(i,arr);
	}
	System.out.println(o);
 /* JSONArray arr = new JSONArray();  
  JSONArray arr1 = new JSONArray();  
  JSONArray arr2 = new JSONArray();  
  JSONArray arr3 = new JSONArray();  
  JSONArray arr4 = new JSONArray();  
  JSONArray arr5 = new JSONArray(); 
  
  arr.add("Priya");    
  arr.add(new Integer(27));    
  arr.add(new Double(600000));  
  
  arr1.add("Srinath");    
  arr1.add(new Integer(27));    
  arr1.add(new Double(600000));   
  
  arr2.add("Sasi");    
  arr2.add(new Integer(27));    
  arr2.add(new Double(600000));   
  
  
  arr3.add("Senthil");    
  arr3.add(new Integer(27));    
  arr3.add(new Double(600000));   
  
  
  arr4.add("Hari");    
  arr4.add(new Integer(27));    
  arr4.add(new Double(600000));   
  
  arr5.add("Subi");    
  arr5.add(new Integer(27));    
  arr5.add(new Double(600000));   
  System.out.print(arr); 
  System.out.print(arr1); 
  System.out.print(arr2); 
  System.out.print(arr3); 
  System.out.print(arr4); 
  System.out.print(arr5); */
}}    