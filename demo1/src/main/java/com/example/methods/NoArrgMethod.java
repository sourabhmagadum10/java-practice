package com.example.methods;

public class NoArrgMethod {
	public static void division() {
		int a=20;
		int b= 10;
		int c= a-b;
		System.out.println(c);
	}
	
	public static String ename() {
		String name="Sourabh";
		int num= 10;
		return name+ num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division();
		String e=ename();
		System.out.println(e);

	}

}
