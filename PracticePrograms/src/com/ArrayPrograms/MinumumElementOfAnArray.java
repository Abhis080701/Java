package com.ArrayPrograms;

public class MinumumElementOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = new int[] {1,2,3,0,22,5};

int min =arr[0];
for(int i=0;i<arr.length;i++)
{

if(arr[i]<min)
	min = arr[i];
}

System.out.println("The Smallest Element is: "+min);
	}
	

}
