package abhishek;

import java.util.Scanner;

public class PrimeNumberP2 {
	static void PrimeNum(int n) {
		int flag = 0, m = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is Not Prime Number ");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is Not Prime Number");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println(n + " is Prime Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter the Number u want to check whether it is Prime or Not");
            int num = sc.nextInt();
            PrimeNum(num);
	}

}
