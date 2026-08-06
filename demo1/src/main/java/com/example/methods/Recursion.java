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
//		System.out.println(n);
		if(n%2 != 0 && n != a) {
			System.out.println(n);
			n++;
			if(n == a)
				return;
		}
		evenNum(n++ ,a);
	}
	
	public static int sumDigit(int num) {
		
		if(num == 0) 
			return 0;
		int d= num% 10;
		num= num/10;
		return d + sumDigit(num);
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test(1);
		evenNum(1,9);
		
//		System.out.println(sumDigit(244));
	}
	
	

}
