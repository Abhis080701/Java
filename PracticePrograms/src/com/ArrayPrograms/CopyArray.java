package com.ArrayPrograms;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.print("Elements Of An Original Array is: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}

		System.out.println();
		System.out.print("Elements of Copied Array is: ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+ "  ");
		}
	}

}
