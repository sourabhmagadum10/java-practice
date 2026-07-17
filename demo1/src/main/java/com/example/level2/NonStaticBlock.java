package com.example.level2;

public class NonStaticBlock {
	int a= 10;
	{
		System.out.println(a);
	}
	static {
		System.out.println("hfdhfjhgfhsvrf...");
	}
	
	public static void main(String[] args) {
		System.out.println("shdgs");
		NonStaticBlock n = new NonStaticBlock();
		n.a=100;
		NonStaticBlock n1 = new NonStaticBlock();
	}
	
	static {
		System.out.println("ended////...");
	}

}
