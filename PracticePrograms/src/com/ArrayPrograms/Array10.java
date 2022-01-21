package com.ArrayPrograms;

public class Array10 {

	public void rotate(int[] arr, int d, int n) {
		for (int i = 0; i < d; i++) {
			leftRotationOne(arr, n);
		}

	}

	public void leftRotationOne(int[] arr, int n) {
		int temp;
		temp = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
			arr[n - 1] = temp;
		}

	}

	public void PrintArr(int[] arr, int n) {
		for (int j = 0; j < arr.length; j++) {

			System.out.println(arr[j] + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array10 arr = new Array10();
		int arr1[] = { 1, 2, 3, 4, 5 };
		arr.rotate(arr1, 3, arr1.length);
		arr.PrintArr(arr1, arr1.length);
	}

}
