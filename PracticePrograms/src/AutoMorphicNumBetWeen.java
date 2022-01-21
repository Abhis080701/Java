import java.util.Scanner;

public class AutoMorphicNumBetWeen {
	private static boolean isAutoMorphic(int num) {
		int square = num * num;
		int temp = num;
		int count = 0;
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
		System.out.println("The AutoMorphic Number Between " + Start + " And " + End + " is: ");
		for (int i = Start; i <= End; i++) {
			if (isAutoMorphic(i)) {
				System.out.print(i + "  ");
			}
		}

	}

}
