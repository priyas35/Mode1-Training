package com.hcl.quiz;

public class Quiz {
	public static void main(String[] args) {
		try {
			int[] a=new int[]{12,5,3};
			a[6]=5/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array");
		}catch(ArithmeticException e){
			System.out.println("arith");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("done by priya srinath");
		}

}
}