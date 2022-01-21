package com.ArrayPrograms;


public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	   int arr1[][] = new int[][] {{1,1,1},{2,2,2},{3,3,3}};	
	   int arr2[][]	 = new int[][] {{1,1,1},{2,2,2},{3,3,3}};
	   
	   int arr[][] = new int[3][3];
	   int add[][] = new int[3][3];
	   
System.out.println("Matrix Multiplication is: ");

	   for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			arr[i][j]=0;
			for (int j2 = 0; j2 < arr.length; j2++) {
				arr[i][j]+=arr1[i][j2]*arr2[j2][j];
			}
		System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
	}
	   
	   System.out.println("Matrix Addition is: ");
	   
	   for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
		add[i][j] = arr1[i][j]+arr2[i][j];	
		}
	
	}
	   //Diplaying addition
	   for (int i = 0; i < add.length; i++) {
		for (int j = 0; j < add.length; j++) {
			System.out.print(add[i][j]+"  ");
		}
		System.out.println();
	}
	   
	}

}
