package com.priya;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
		PriyaProxy pp=new PriyaProxy();
		String result=null;
		try {
			result=pp.getName();
			System.out.println(result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
