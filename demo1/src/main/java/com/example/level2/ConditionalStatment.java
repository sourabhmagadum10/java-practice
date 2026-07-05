package com.example.level2;

public class ConditionalStatment {
	
	
	public static void checkOddEven(int num) {
		if(num>0) {
			if(num%2 == 0)
				System.out.println("number is even");
			else 
				System.out.println("number is odd");
		}
		else 
			System.out.println("enter a valid number");
		
	}
	
	public static void checkLargeNo() {
		int a= 2;
		int b =3;
		int c= 10;
		int cho= 1;
		switch(cho) {
		case 0: System.out.println(a+b+c);break;
		case 1: System.out.println(a-b-c);
		case 2: System.out.println(a+b*c);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		checkOddEven(6);
		checkLargeNo();
	}

}
