package com.ArrayPrograms;

import java.util.Scanner;

public class leftrotateArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Left Rotation: ");
		int n = sc.nextInt();

		System.out.println("Original Array before Rotating: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		int j, first;
// Where n is number of left Rotation's.
		for (int i = 0; i < n; i++) {
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}
		System.out.println();

		System.out.println("Array After Left Rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.print(e);
			}
		}
	}

}
