package abhishek;

import java.util.Scanner;

public class                                                    PlindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		Original = sc.nextLine();
		int len = Original.length();
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + Original.charAt(i);
		}
		if (Original.equals(reverse)) {
			System.out.println(" Given String is Palindrome");
		} else {
			System.out.println(" Given String is Not Palindrome");
		}
	}

}
