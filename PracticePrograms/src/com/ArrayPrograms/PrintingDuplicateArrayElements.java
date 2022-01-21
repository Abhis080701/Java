package com.ArrayPrograms;

public class PrintingDuplicateArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                            
int arr[] = new int[] {1,2,3,4,5,3,2,5};

System.out.println("Duplicate Elements are: ");

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
	 if(arr[i]==arr[j])
		 
		System.out.print(arr[j]+"  ");
	}
}
	}

}
