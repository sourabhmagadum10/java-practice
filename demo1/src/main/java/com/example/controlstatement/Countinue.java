package com.example.controlstatement;

public class Countinue {
	
	
	public static void num() {
		for(int i= 0; i< 20; i++) {
			if(i==10)//skip the 10th iteration
				continue;
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
	}

}
