package com.priya;

import java.rmi.RemoteException;

public class MainApplication {
	public static void main(String[] args) {
		int result=0;
		int result1=0;
		CalculatorProxy cp=new CalculatorProxy();
		try {
			result=cp.mul(2,4);
			System.out.println("Multiplication of 2 Numbers:"+result);
			result1=cp.add(3,5);
			System.out.println("Addition of 2 Numbers:"+result1);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
