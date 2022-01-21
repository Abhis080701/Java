package com.ArrayPrograms;

import java.util.Scanner;

public class Array8 {
public static void main(String []arg)
{
	String arr[][] = new String[10][10];
	//System.out.println(arr.length);
	Scanner strScanner = new Scanner(System.in);
	
	int r = 0,c=2;
	System.out.println("Enter the Number of row's Out of 10");
	r =   Integer.parseInt(strScanner.nextLine());
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
			System.out.print("Enter the array Element's arr["+i+"]["+j+"]"+"  => ");
			arr[i][j] = strScanner.nextLine();
		}
	}
	System.out.println("The Array Element's are: ");
	
	for (int i = 0; i < r; i++) {
		System.out.print("[");
		for (int j = 0; j < c; j++) {
			System.out.print(" "+arr[i][j]+" ");
		}
		System.out.print("],");
		
		
	}
	
}
}
