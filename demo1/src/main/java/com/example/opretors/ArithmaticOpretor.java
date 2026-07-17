package com.example.opretors;

public class ArithmaticOpretor {
	
	public static void addOpretor() {
		//number only
		int a= 10;
		int b=10;
		int c= a + b;
		System.out.println(c);
		
		//number + char 
		double a1= 10;
		char b1= 'a';//ascci value 97 
		double c1= 10+'a';
		System.out.println(c1);
		
		// string value + mix
		
		System.out.println("nitten" + "c");
		System.out.println("sdhgsc" + 2374);
		
	}
	
	public static void minusOpretor() {
		int n= 10;
		double d= 999.5;
		char c= 'b';
		n-=d;
		d-=c;
		System.out.println(n + "\n" +d);
		
	}
	
	public static void starOpretor() {
		int n= 10;
		char c= 'a';
		String s= "aniket";
		String s1=s+c+n*n;
		System.out.println(s1);
		System.out.println(10*2+'a'+'d');
		
	}
	
	public static void slashOpt() {
		int n= 3;
		char c= 'c';
		System.out.println(c/n);
	}
	
	public static void modOpt() {
		int n= 3;
		char c='b';
		System.out.println(c%n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		addOpretor();
//		minusOpretor();
//		starOpretor();
//		slashOpt();
		modOpt();
	}

}
