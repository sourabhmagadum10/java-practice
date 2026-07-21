package com.example.methods;

public class ParameterrizedMethod {
	public static int addition(int num1, int num2)
	{
		return num1+num2;
	}
	
	public static void multi(int num1, int num2) {
		int c= num1*num2;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=addition(10, 200);
		System.out.println(a);
		multi(5,2);

	}

}
