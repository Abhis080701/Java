package com.ArrayPrograms;

public class ArrayElementInDesendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
int temp = 0;
System.out.println("Original Array: ");
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}

for(int i=0;i<arr.length;i++)
{
	for(int j=1+i;j<arr.length;j++)
	{
		if(arr[i]<arr[j])
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
}

System.out.println();
System.out.println("Desending ORDER......");
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
