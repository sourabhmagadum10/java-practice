package com.example.opretors;

public class TernaryOpertor {
	public static void evenOdd() {
		int num= 7;
		String a= num%2==0 ? "number is even" : "number is odd";
		System.out.println(a);
	}
	
	public static void largeNum() {
		int a =10;
		int b= 2	;
		String c=a > b ?  a + "is greater": b+ "is greateer";
		System.out.println(c);
	}
	
	public static void largeAmongTree() {
		int a= 20;
		int b=30;
		int c=4;
		
		String v= (a>b)&&(a>c)?"a is greater" :(b>c)? "b is greater": "c is greater";
		System.out.println(v);
	}
	
	public static void largeAmong4() {
		int a= 100;
		int b=4;
		int c=3;
		int d= 20;
		
		String e= (a>b)&&(a>c)&&(a>d)?"ais greater":(b>c)&&(b>d)?"b is greater":(c>d)?"c is greater":"d is greater";
		System.out.println(e);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		evenOdd();
//		largeNum();
//		largeAmongTree();
		largeAmong4();
		
	}

}
