package abhishek;

import java.util.Scanner;

public class AutoMorphicBetWeen {
	private static boolean isAutoMorphicBetWeen(int num) {
		int square = num * num;
		int count = 0;
		int temp = num;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		int LastDigit = (int) (square % (Math.pow(10, count)));
		return num == LastDigit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Start, End;
		System.out.println("Enter the Start Number: ");
		Start = sc.nextInt();
		System.out.println("Enter the End Number: ");
		End = sc.nextInt();
		System.out.println("The AutoMorphic Number Between "+Start+" And "+End+" is: ");
		for (int i = Start; i <= End; i++) {
			if (isAutoMorphicBetWeen(i)) {
				System.out.print(i + "  ");
			}
		}
	}


}
/*
Enter the Start Number: 
1
Enter the End Number: 
100
The AutoMorphic Number Between 1 And 100 is: 
1  5  6  25  76  
*/