package com.ArrayPrograms;

import java.util.Scanner;

/*
 * Write a program to check if elements of an array are same or not it read from front or back.
 */
public class Array9 {
	public static void main(String[] arg) {
		int arr[] = new int[6];
		boolean read = true;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the Value arr[" + i + "]");
			arr[i] = scanner.nextInt();
		}
		
		int j = arr.length - 1;
		
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[j]) {
				read = false;
				break;
			} else {
				j--;
			}
		}

		System.out.println(read);
	}

}
/*
 * 
 * Enter the Value arr[0]1 Enter the Value arr[1]2 Enter the Value arr[2]3 Enter
 * the Value arr[3]3 Enter the Value arr[4]2 Enter the Value arr[5]1 true
 * 
 * 
 * 
 * 
 */
