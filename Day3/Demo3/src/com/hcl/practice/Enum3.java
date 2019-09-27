package com.hcl.practice;

enum Student{
	Anisha,Laksh,Rishab,Keerthana,Nivetha
}

public class Enum3 {
	
	public static void show(){
		Student[] arrStudent =Student.values();
		for (Student student : arrStudent) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		show();
	}

}
