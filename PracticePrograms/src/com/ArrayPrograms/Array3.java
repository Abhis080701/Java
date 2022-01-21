package com.ArrayPrograms;

import java.util.Scanner;
/*
 * Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
 */
public class Array3 {
public static void main(String []ag) throws InterruptedException {
	Scanner in = new Scanner(System.in);
	int arr1[] = new int[10];
	int arr2[] = new int[10];
	for (int i = 0; i < arr1.length; i++) {
		System.out.println("Enter the Element arr1["+(i)+"]");
		arr1[i] = in.nextInt();
	}

int j = 0;
for (int i = arr2.length-1; i >=0; i--) {
	arr2[i] = arr1[j];
	j++;
}
System.out.println("Copying and Reversing the Array Element's Are: ");
for (int i = 0; i < arr2.length; i++) {
	System.out.print(arr2[i]+"  ");
	
	Thread.sleep(1000);
	
}


}


}
