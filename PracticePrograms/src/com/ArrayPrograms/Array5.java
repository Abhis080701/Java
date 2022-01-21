package com.ArrayPrograms;

import java.util.Scanner;



public class Array5 {
public static void main(String []arg) {
	
	Scanner input = new Scanner(System.in);
	int ar2d[][] = {{1,2,3},{4,5,6}};  // 2 Dimenstional Array 

	for(int i=0;i<ar2d.length;i++)
	{
		for(int j=0;j<ar2d[i].length;j++)
		{
			System.out.print(ar2d[i][j]+" ");
		}
		System.out.println();
	}
}

}
