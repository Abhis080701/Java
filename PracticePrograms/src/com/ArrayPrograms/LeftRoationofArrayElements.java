package com.ArrayPrograms;

import java.util.Scanner;

public class LeftRoationofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Left rotation u want: ");
		int n = sc.nextInt();
		int first, j;
		System.out.println("Before Rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		for (int i = 0; i < n; i++) {
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}
		System.out.println();
		System.out.println("After Left Rotation: ");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "  ");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
	}

}
