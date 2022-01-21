package com.ArrayPrograms;

import java.util.Scanner;

/*
 * Write a program to find the sum and product of all elements of an array.
 */
public class Array4 {
	public static void main(String[] arg) {
   Scanner scanner= new Scanner(System.in);
   int arr[] = new int[5];
   int sum =0, pro =1;
     
   for (int i = 0; i < arr.length; i++) {
	System.out.println("Enter the Number to Find its sum and product of array Elements: arr["+(i+1)+"]");
	arr[i] = scanner.nextInt();
}
   
 
   for (int i = 0; i < arr.length; i++) {
	sum += arr[i];
}
   System.out.println("The Sum Of All Array Element's Are: "+sum);
		
   
   for (int i = 0; i < arr.length; i++) {
	pro *= arr[i];
}
   System.out.println("The Product Of All Array Element's Are: "+pro);
		
		
		
	}

}
