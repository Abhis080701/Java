package com.ArrayPrograms;

public class ArrayElementinAsendingOrder {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int temp = 0;
		System.out.println("Original Array: ");

		for (int i = 0; i < arr.length; i++) {
		
		System.out.print(arr[i]+"  ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		System.out.print("\n");
		System.out.println("Array in Asending Order is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
}