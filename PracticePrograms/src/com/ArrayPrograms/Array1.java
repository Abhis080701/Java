package com.ArrayPrograms;


import java.util.Iterator;
import java.util.Scanner;

/*
 * Take 10 integer inputs from user and store them in an array and print them on screen.
 */
public class Array1 {
	
	public static void main(String args[]) {
		
	
	Scanner scanner = new Scanner(System.in);
		int []a = new int[10] ;// 10 integer Array.
		int flag=1;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the Value of a["+(i+1)+"]");
			a[i] = scanner.nextInt();
			
		}
		System.out.print(" The Array Elements Are: ");
		for(int j =0;j<a.length;j++)
		{
			System.out.print(a[j]+"  ");
		}
		
		System.out.println();
		
		
	}
}
