package com.example.array;

import java.util.Scanner;

public class ArrayBasic {
	
	//array deceleration and initialization
	public static void arr() {
		int [] a=  new int[10];
		int b[] = new  int [3];
		a[1]=10;
		b[0]=10;
		b[2]=23;
		a[0]= 20;
		
		for(int c : a) {
			System.out.println(c);
		}
		
	}
	//print even num in array
	public static void evenArr() {
		int a []= {1,31,20,10,3,12,14,30};
		System.out.println(a.length);
		for(int i= 0; i< a.length; i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void sumArr() {
		int a []= {12,12,6};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
	
	//addition of even index numbers
	public static void sumEvenIdx() {
		int sum=0;
		int a [] = {12,34,54,656,7,784,343,34,};
		for(int i=0; i < a.length; i++) {
			if(i%2 != 0) {
				sum+= a[i];
			}
		}
		System.out.println(sum);
		
	}
	//multiply the array elements taking input from user
	
	public static void multiArr() {
		
		int arr []= new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<arr.length-1; i++) {
			arr[i]=sc.nextInt();
		}
		for(int a: arr ) {
			System.out.println(a);
		}
		int a= 1;
		for(int i =0; i< arr.length; i++) {
			a*= arr[i];
			System.out.println(a);
		}
		
	}
	
	public static void sumNpro() {
		int sum= 0;
		int pro= 1;
		int [] arr= {12,3,53,23,52,1,7,9,32,11,13,20};
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]%2 != 0 && i%2 != 0) {
				sum += arr[i]; 
			}
			else {
				pro *= arr[i];
			}
		}
		System.out.println(sum+ "  "+pro);
	}
	//search a element
	public static void searchEle() {
		int [] arr= {12,3,52,4,87,1};
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to search");
		int search= sc.nextInt();
		for(int i=0; i< arr.length; i++) {
			if(arr[i]== search) {
				System.out.println("element found at index " +i);
			}
		}
	}
	
	//find largest element
	public static void largeEle() {
		int arr []= {12,1,3,5,10,9,100,50,132323,201};
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>temp) {
				temp = arr[i];
			}
		}
		System.out.println(temp);
	}
	//reverse array
	public static void reverseArray() {
		int arr[]= {2,12,45,78,3,24};
		int arr1[]= new int[arr.length];
	
		for(int i= 0; i <arr.length;i++) {
			arr1[i]= arr[arr.length -1 -i];
		}
		for(int b : arr1) {
			System.out.print(b+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a []= {12,343,123,4};
//		System.out.println(a);
//		for( int b : a) {
//			System.out.println(b);
//		}
//		evenArr();
//		sumArr();
//		sumEvenIdx();
//		 multiArr();
//		sumNpro();
//		searchEle();
//		largeEle();
		reverseArray();

	}

}
