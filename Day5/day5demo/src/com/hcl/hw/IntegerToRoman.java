package com.hcl.hw;


import java.util.HashMap;
import java.util.Scanner;
 
public class IntegerToRoman
{
	public static int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	public static HashMap<Integer, String> map = new HashMap<Integer, String>();
 
	public static void setup()
	{
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
	}
 
	public String Roman(int n)
	{
		setup();
		String res=new String();
		for (int i : base)
		{
			while(n>=i)
			{
				res+= map.get(i);
				n-= i;
			}
		}
		return res;
	}
 
	public static void main(String arg[])
	{
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		IntegerToRoman in = new IntegerToRoman();
		int val=no;
		String sd = in.Roman(val);
		System.out.println("value= " + sd);
	}
}