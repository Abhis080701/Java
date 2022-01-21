package abhishek;

import java.util.Scanner;

public class AmstrongOFNumber {
	static boolean isAmtrong(int n) {
		int last = 0, sum = 0, digit = 0, temp;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}

		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digit));
			temp = temp / 10;
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int f1 = sc.nextInt();
		System.out.println("Enter the Last Number: ");
		int l1 = sc.nextInt();
		System.out.println("The Amtrong Number From Range" + f1 + "to" + l1 + "is: ");
		for (int i = f1; i <= l1; i++) {

			if (isAmtrong(i))
				System.out.print(i + ",");

		}

		System.out.println("\nEnter the Single Number for checkking if it is Amtrong or Not");
		int n1 = sc.nextInt();
		if (isAmtrong(n1)) {
			System.out.println("The Given " + n1 + " Number is Amstrong");
		} else {
			System.out.println("The Given " + n1 + " Number is  not a Amstrong");
		}
	}

}
