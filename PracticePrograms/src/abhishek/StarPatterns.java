package abhishek;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Right Triangle Pattern");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Rows U want to Print ");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++)

			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Left Triangle Pattern");

		System.out.println("Enter the Number Of Rows U want to Print ");
		int row1 = sc.nextInt();
		int i,j;
		for (i = 0; i < row1; i++) {
			
			for (j = 2 * (row - i); j >= 0; j--) 
			{
				System.out.print(" ");
			
			}
			
			
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
