package com.ArrayPrograms;

import java.util.Scanner;

/*
 * 
 Take 20 integer inputs from user and print the following:
 number of positive numbers
 number of negative numbers
 number of odd numbers
 number of even numbers
 number of 0s.
 * 
 */
public class Array2 {
	public static void main(String[] args) {
		int positive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		int zero = 0;

		Scanner inScanner = new Scanner(System.in);
		int arr[] = new int[20];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Value of arr[" + (i + 1) + "]");
			arr[i] = inScanner.nextInt();

			if (arr[i] > 0) {
				positive++;
			}else
			if (arr[i] < 0) {
				negative++;
			} else if (arr[i] == 0) {
				zero++;
			}
			
			if (arr[i]%2==0) {
				even++;
			}
			else 
				{
					odd++;
				}
			

			
		}
		System.out.println("ZERO: "+zero+"\tPOSITIVE:  "+positive+"\tNEGATIVE: "+negative+"\t EVEN: "+even+"\t ODD: "+odd);

	}

}
