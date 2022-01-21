package com.ArrayPrograms;


public class SortAnArrayInAsendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] = new int[] {4,6,2,3,8,1};
   int temp=0;
   System.out.println("Original Array: ");
   for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+"  ");
	}
   
   for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if (arr[i]>arr[j]) {
		temp = arr[i];
		arr[i] =arr[j];
		arr[j] =temp;
		}
	}
}
   System.out.println();
   System.out.println("Array Elements in Asending Order: ");
   for(int i=0;i<arr.length;i++) {
	   System.out.print(arr[i]+"   ");
   }
   
   }

}
