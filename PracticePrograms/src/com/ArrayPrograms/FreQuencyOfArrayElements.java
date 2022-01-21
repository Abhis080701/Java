package com.ArrayPrograms;

public class FreQuencyOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 0, 0, 33, 0, 1, 2, 99, 99, -2, -2, -1, 9, 9, 56, -2 };
		int fr[] = new int[arr.length];
		int visit = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visit;
				}

			}
			if (fr[i] != visit) {
				fr[i] = count;
			}
		}
		System.out.println("---------------------");
		System.out.println("Elements  |  FreQuency");
		System.out.println("---------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visit)
				System.out.println("  " + arr[i] + "      " + fr[i]);

		}
		System.out.println("---------------------");
//	for(int k = 0;k<fr.length;k++)
//	{
//		System.out.println(fr[k]);
//	}
	}

}
