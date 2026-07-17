package com.example.opretors;

public class IncrementDecrement {
	
	public static void preIncerment() {
		int a=9;
//		++a;
		System.out.println(++a);
		System.out.println(a);
		
		int n= 10;
		char c= 'a';
		n+=++c;
		System.out.println("c " +c);
		System.out.println(n);
	}
	
	public static void postIncerment() {
		int a =9;
//		a++;
		System.out.println(a++);//difference here
		System.out.println(a);
		
		int b= -21;
		int c= ++a-b++ +b- ++b +a;
		System.out.println(c);
	}
	
	public static void preDecement() {
		int a= 11;
		System.out.println(--a);
		System.out.println(a);
	}
	
	public static void postDecrement() {
		int a=11;
		System.out.println(a--);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		preIncerment();
//		postIncerment();
//		preDecement();
		postDecrement();
		
	}

}
