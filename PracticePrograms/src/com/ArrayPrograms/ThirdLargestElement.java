package com.ArrayPrograms;

public class ThirdLargestElement {
	public static int getthirdLarget(int a[],int total)
	{
		int temp=0;
		for(int i=0;i<total;i++)
		{
			for(int j=0;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[total-3];
		
	}
public static void main(String[] args)
{
	int arr[] =  new int[] {1,2,3,4,5};
	int arr1[] = new int[] {11,44,55,33,22};
	System.out.println("Thired Largest Element is: "+getthirdLarget(arr,arr.length));
	System.out.println("Thired Largest Element is: "+getthirdLarget(arr1,arr1.length));
}
}
