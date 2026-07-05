package com.example.level1;

public class OperationOnDatatypes {
	public static void add() {
		int a= 10;
		int b= 20;
		
		System.out.println("addition "+ (a+ b) );
	}
	
	public static int subst() {
		int a = 10;
		int b= 5;
		int c= a- b;
		return c;
		
	}
	
	public static void multi(int a , int b) {
		System.out.println(a*b);
	}

	public static double div() {
		int a= 15;
		int b= 2;
		double c= (a/b);
		return c;
	}
	public static void main(String[] args) {
		add();
		System.out.println(subst());
		System.out.println(div());
		multi(20, 10);
	}
}

