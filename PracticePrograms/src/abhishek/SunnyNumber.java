package abhishek;

import java.util.Scanner;

public class SunnyNumber {
	static boolean FindPerfectNumber(double num) {
		double sq_root = Math.sqrt(num);
		return ((sq_root - (Math.floor(sq_root)) == 0));
	}

	static void isSunnyNuber(int n) {
		if (FindPerfectNumber(n + 1)) {
			System.out.println("The Given Number is Sunny Number!");
		} else {
			System.out.println("The Given Number is Not Sunny Number!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = sc.nextInt();
		isSunnyNuber(n);
//		System.out.println(FindPerfectNumber(81));
		}

}
