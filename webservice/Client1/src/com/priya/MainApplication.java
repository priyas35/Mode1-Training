package com.priya;

import java.rmi.RemoteException;

import com.bindu.BinduProxy;
import com.jehanat.SapCodeProxy;


public class MainApplication {
   public static void main(String[] args) {
	int result=0;
	BinduProxy bp=new BinduProxy();
	try {
		result=bp.getInt();
		System.out.println(result);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    SapCodeProxy sp=new SapCodeProxy();
    int res1=0;
    try {
		res1=sp.getInt();
		System.out.println(res1);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    CalculatorProxy cp=new CalculatorProxy();
    int res2=0;
    try {
		res2=cp.add(result, res1);
		System.out.println(res2);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
