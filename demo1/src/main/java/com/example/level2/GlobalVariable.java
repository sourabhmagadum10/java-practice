package com.example.level2;

public class GlobalVariable {

	String nameOfStudent= "Santosh";
	static String college= "Svs";
	
	public static void main(String [] args) {
		GlobalVariable gv = new GlobalVariable();
		System.out.println(gv.nameOfStudent);
		System.out.println(gv.nameOfStudent);
		System.out.println(gv.college);
		System.out.println(gv.college);
	}
}
