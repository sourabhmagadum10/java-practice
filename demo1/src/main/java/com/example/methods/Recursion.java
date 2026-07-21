package com.example.methods;

public class Recursion {

	public static void test(int a) {
		System.out.println(a);
		if(a == 5) {
			return;
		}
		test(a +1);
	}
	
	public static void evenNum(int n, int a) {
		System.out.println(n);
		if(n%2 ==0 ) {
			if(n<a) {
				return;
			}
			
		}
		
		evenNum(n +1, a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test(1);
		evenNum(1,30);
	}

}
