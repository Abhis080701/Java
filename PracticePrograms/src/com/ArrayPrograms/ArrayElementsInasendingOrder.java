package com.ArrayPrograms;

public class ArrayElementsInasendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = new int[] {1,5,2,9,1,3,4};
int temp = 0;
System.out.println("Original Array: ");
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+"  ");
}
for(int i=0;i<arr.length;i++)
{
	for(int j=1+i;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp =arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	

}
System.out.println();
System.out.println("Array in Asending Order is: ");
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
}

}
