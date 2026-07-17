package com.example.conditional_statement;

import java.util.Scanner;

public class SwitchCase {
	
	public static void day() {
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter a number for day");
		int ch= sc.nextInt();
		switch(ch) {
		case 1: System.out.println("Sunday");break;
		case 2:System.out.println("Monday");break;
		case 3:System.out.println("tuesday"); break;
		case 4: System.out.println("wendsday");break;
		case 5: System.out.println("Friday");break;
		default:System.out.println("number is wrong");
		}
	}
	
	public static void vowelChecker() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a alphabet");
		char c= sc.next().charAt(0);
		switch(c) {
		case 'a':System.out.println("vowel");break;
		case 'e':System.out.println("vowel");break;
		case 'i':System.out.println("vowel");break;
		case 'o':System.out.println("vowel");break;
		case 'u':System.out.println("vowel");break;
		default: System.out.println("Not a vowel");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		day();
		vowelChecker();

	}

}
