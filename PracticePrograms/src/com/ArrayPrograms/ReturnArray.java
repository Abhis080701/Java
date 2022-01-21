package com.ArrayPrograms;

public class ReturnArray {
	
	static int[] getarr()
	{
		return new int[] {1,2,3,4,5};
		
	}
	
public static void main(String []ar)
     {
	int arr[] = getarr();
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+"  ");
	}
	
	}
}
