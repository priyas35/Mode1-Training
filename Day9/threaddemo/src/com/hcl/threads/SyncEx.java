package com.hcl.threads;


class Data{
 synchronized	void dispMsg(String name){
		System.out.print("Hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" How r u....");
	}
}

class Uttam extends Thread{
	Data d;
	Uttam(Data d){
		this.d=d;
	}
	@Override
	public void run() {
		d.dispMsg("uttam");
	}
}

class Bindu extends Thread{
	 Data d;
	 Bindu(Data d){
		 this.d=d;
	 }
	 @Override
	public void run() {
		d.dispMsg("bindu");
	}
}

class Hema extends Thread{
	Data d;
	Hema(Data d){
		this.d=d;
		
	}
	@Override
	public void run() {
		d.dispMsg("Hema");
	}
}

public class SyncEx {
	public static void main(String[] args) {
		Data d=new Data();
		Uttam u=new Uttam(d);
		Bindu b=new Bindu(d);
		Hema h=new Hema(d);
		Thread t1=new Thread(u);
		Thread t2=new Thread(b);
		Thread t3=new Thread(h);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
