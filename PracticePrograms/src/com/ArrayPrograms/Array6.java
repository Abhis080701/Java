package com.ArrayPrograms;
import java.util.Scanner;
/*
 * Initialize and print all elements of a 2D array.
 */
public class Array6 {
public static void main(String []arg) {
	Scanner  In = new Scanner(System.in);
	int r=0,c=0;
	int arr[][] = new int[10][10];
	System.out.println("Enter the Number of rows Out of 10: ");
    r = In.nextInt();
    System.out.println("Enter the Number of Column's Out of 10: ");
    c = In.nextInt();

	for (int i = 0; i < r; i++) {
		for (int j = 0; j <c; j++) {
			
		   System.out.print("Enter the element arr["+i+"]["+j+"]");
			arr[i][j] = In.nextInt();
		}
		
	}
	
	System.out.println("The Array Element's Are: ");
	
	for (int i = 0; i <r; i++) {
		for (int j = 0; j < c; j++) {
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
	}
	
}
}
