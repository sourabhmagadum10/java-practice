package com.example.looping_statement;

public class WhileLoop {
	
	public static void printNumber() {
		int num= 0;
		while(num<9) {
			num++;
			System.out.print(num
					);
		}
	}
	
	public static void evenNum() {
		int n=20;
		while(n>0) {
			n--;
			if(n%2==0)
				System.out.println(n);
		}
	}
	
	public static void oddNum() {
		int n=0;
		while(n<50) {
			n++;
			if(n%2 != 0) {
				System.out.println(n);
			}
		}
	}
	
	public static void primeNum() {
		int n=2;
		int d=1;
		while(n >d) {
			while(d<=n) {
				if(n%d==0) {
					System.out.println(n);
				}
			d++;
			}
			n++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printNumber();
//		oddNum();
		primeNum();

	}

}
