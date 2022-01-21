package abhishek;

import java.util.Scanner;

public class PrimeNumberP3 {
	static boolean isprime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number single number");
		int num = sc.nextInt();
		if (isprime(num)) {
			System.out.println(num + " is Prime Number ");

		} else {
			System.out.println(num + " is Not Prime Number ");
		}

		System.out.println();
		System.out.println("Enter the Number First number");
		int start = sc.nextInt();
		System.out.println("Enter the Number last number");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			if (isprime(i)) {
				System.out.println(i + " is Prime Number ");

			} else {
				System.out.println(i + " is Not Prime Number ");
			}

		}

	}

}
