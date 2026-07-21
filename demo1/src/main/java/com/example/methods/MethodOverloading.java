package com.example.methods;

public class MethodOverloading {
	public static void add(int num1, int num2) {
		int c= num1+ num2;
		System.out.println(c);
	}
	
	public static void add(int num1, float num2) {
		float c= num1+ num2;
		System.out.println(c);
	}
	
	public static void add(int num1, int num2, int num3) {
		int c= num1+ num2 + num3;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,40.7f);
	}

}
