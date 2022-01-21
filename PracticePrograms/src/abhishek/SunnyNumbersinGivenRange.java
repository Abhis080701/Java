package abhishek;

import java.util.Scanner;

public class SunnyNumbersinGivenRange {
	static boolean isSunnyNumber(int num) {
		if (Math.sqrt(num + 1) % 1 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lowrange, highrange;
		System.out.println("Enter the Lower Range: ");
		lowrange = sc.nextInt();
		System.out.println("Enter the High Range: ");
		highrange = sc.nextInt();

		for (int i = lowrange; i <= highrange; i++) {
			if (isSunnyNumber(i)) {
				System.out.print(i + "  ");
			}
		}

	}

}
/*
 * 
Enter the Lower Range: 
1
Enter the High Range: 
1000
3  8  15  24  35  48  63  80  99  120  143  168  195  224  255  288  323  360  399  440  483  528  575  624  675  728  783  840  899  960  
 */
