package com.hcl.qz;

public class Ex2 {
	public static void main(String[] args) {
		try {
			System.out.println("a");
			throw new NullPointerException();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException e){
			//System.out.println("error");
			throw new NumberFormatException();
		}catch(NumberFormatException e){
			System.out.println("rethrown");
		}
	}

}
