package helloservice.endpoint;

import java.rmi.RemoteException;

public class MainApplication {
	public static void main(String[] args) {
		HelloProxy hp=new HelloProxy();
		String res=null;
		try {
			res=hp.sayHello("Priya");
			System.out.println(res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("http.proxyHost", "");

		System.setProperty("http.proxyPort", "");
	}

}
