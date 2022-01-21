package com.ArrayPrograms;

public class PrintArrayElementWhichAtEvenposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println("The Array Elements At a EVEN positions is: ");
		for (int i = 1; i < arr.length; i += 2) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("The Array Elements At a ODD positions is: ");
		for (int i = 2; i < arr.length; i += 2) {
			System.out.print(arr[i] + "  ");
		}
	}

}
