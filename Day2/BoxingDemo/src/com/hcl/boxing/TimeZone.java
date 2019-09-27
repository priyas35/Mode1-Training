package com.hcl.boxing;

public class TimeZone {
	int hrs,minutes;
	
	

	public TimeZone() {
		
		
	}
	public TimeZone(int hrs, int minutes) {
	
		this.hrs = hrs;
		this.minutes = minutes;
		
	}
	public TimeZone add(TimeZone t1,TimeZone t2){
		
		TimeZone t3=new TimeZone();
		
		 t3.hrs=t1.hrs+t2.hrs;
		 t3.minutes=t1.minutes+t2.minutes;
		
		if(t3.minutes >=60){
			t3.hrs++;
			t3.minutes=t3.minutes%60;
			
		}
		return t3;
	}
	
	
	@Override
	public String toString() {
		return "TimeZone [hrs=" + hrs + ", minutes=" + minutes + "]";
	}
	public static void main(String[] args) {
		TimeZone t1=new TimeZone(3, 40);
		TimeZone t2=new TimeZone(4, 40);
		TimeZone t3=new TimeZone().add(t1,t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
	}
	
	

}
