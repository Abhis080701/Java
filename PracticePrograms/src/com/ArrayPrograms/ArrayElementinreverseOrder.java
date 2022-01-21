package com.ArrayPrograms;

public class ArrayElementinreverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Before reversing: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
		System.out.println("After reversing: ");
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + "  ");
		}
	}

}
