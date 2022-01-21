package com.ArrayPrograms;

public class TransPoseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Original[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
int transpose[][] = new int[3][3];

System.out.println("Transpose Matrix in Process....");
for (int i = 0; i < Original.length; i++) {
	for (int j = 0; j < Original.length; j++) {
		transpose[i][j] = Original[j][i];
	}
}

try {
	Thread.sleep(3000);
} catch (Exception e) {
System.out.println(e);
}

System.out.println("Before TransPose Matriix is: ");
for (int i = 0; i < Original.length; i++) {
	for (int j = 0; j < Original.length; j++) {
		System.out.print(Original[i][j]+"  ");	
		}
	System.out.println();
}


System.out.println("After TransPose Matriix is: ");
for (int i = 0; i <transpose.length; i++) {
	for (int j = 0; j < transpose.length; j++) {
		System.out.print(transpose[i][j]+"  ");	
		}
	System.out.println();
}

	}

}
