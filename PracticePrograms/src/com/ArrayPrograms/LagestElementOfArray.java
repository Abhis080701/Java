package com.ArrayPrograms;

public class LagestElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = new int[] {100,2,3,77,8,9,20,200,99};
int max = arr[0];
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>max)
		max = arr[i];
	
}
System.out.println("Largest Element is: "+max);
	}

}
