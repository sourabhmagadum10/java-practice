package com.example.level2;

public class ScopOfVariable {
	int b= 20; //non static global variable 
		static int a =10;//static globle variable
		//these are the global varibles 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 2;//local variable
		System.out.println(new ScopOfVariable().a);
		System.out.println(a);
	}
}
