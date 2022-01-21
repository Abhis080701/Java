package com.ArrayPrograms;


import java.util.Scanner;

public class Array7 {
public static void main(String []arg) {
	Scanner inScanner= new Scanner(System.in);
	int arr[] = new int[10];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print("Enter the values of array Element arr["+i+"]");
		arr[i] = inScanner.nextInt();
	}
	int large = arr[0];
	int small = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>large)
		{
			large = arr[i];
		}
		else if(arr[i]<small) {
			small =arr[i];
		}
	}
	System.out.println(" Largest is: "+large+"\t Small is: "+small);
}
}
