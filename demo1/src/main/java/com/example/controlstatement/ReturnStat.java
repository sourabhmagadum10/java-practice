package com.example.controlstatement;

public class ReturnStat {
	
	public static int num() {
		int c=0;
		for(int i= 0; i< 10; i++) {
			c += i;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num());
	}

}
