package com.example.conditional_statement;

import java.util.Scanner;

public class IfStatement {

	public static void checkPositive() {
		int num=0;
		if(num !=0) {
			if(num >0)
				System.out.println("number is positvie");
			else 
				System.out.println("number is negative");
		}
		
		else
			System.out.println("Enter a valid number");
	}
	
	public static void eligibleForVote() {
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		if(age>17) {
			System.out.println("Eligible ");
			
		}
		else
			System.out.println("Nope ");
	}
	
	public static void main(String[] args) {
//		checkPositive();
		eligibleForVote();
	}
}
