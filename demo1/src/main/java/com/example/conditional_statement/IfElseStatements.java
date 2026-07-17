package com.example.conditional_statement;

public class IfElseStatements {
	
	public static void checkLargeNum() {
		int num1= 10;
		int num2= 8;
		int num3= 3;
		if(num1 > num2 && num1 > num3) {
			System.out.println("num1 is greater");
		}
		else if(num2>num3) {
			System.out.println("num2 is greater");
		}
		else
			System.out.println("num3 is greater");
	}
	
	public static void checkChar() {
		char c= '7';
		if(c >= 'A' && c<= 'Z') {
			System.out.println("Uppercase");
		}
		if (c >='a' && c<= 'z') {
			System.out.println("lower");
		}
		if(c >= '0') {
			System.out.println("digit");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		checkLargeNum();
		checkChar();

	}

}
