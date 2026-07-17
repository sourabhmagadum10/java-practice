package com.example.level2;

import org.springframework.cglib.core.Block;

public class Blocks {

	String name;
	static {
		System.out.println("heloo");
	}
	{
		System.out.println("bybee");
	}
	public static void main(String[] args) {
		Blocks b = new Blocks();
		String a= b.name= "kanu";
		System.out.println(a);
	}
	
}
