package com.fault;

import java.rmi.RemoteException;

public class Main {
	public static void main(String[] args) {
		HelloWorldProxy hp=new HelloWorldProxy();
		String res=null;
		try {
			res=hp.sayHelloWorld("");
			System.out.println(res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
