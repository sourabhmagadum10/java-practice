package com.example.looping_statement;

public class ForLoop {

	public static void printNum() {
		for(int i=0; i<20;i++) {
			for(int j=0; j<i;j++) {
				System.out.print(i+"   .."+j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printNum();
		
	}
}
