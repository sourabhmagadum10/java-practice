package com.example.pattern;

public class SolidSqure {
	
	public static void squre() {
		for(int i=0; i<10; i++) {
			
			for(int j=1; j<11; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void leftTriangle() {
		for(int i= 0; i<10; i++) {
			for(int j= 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void rightTriangle() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10;j++) {
				if(i==10 ) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		squre();
//		leftTriangle();
		rightTriangle();
	}

}
