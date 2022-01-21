import java.util.Scanner;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int count = 0;
		int square = num * num;
		int temp = num;
		while (temp > 0) {
			count++;
			temp /= 10;

		}
		int LastDigit = (int)(square%(Math.pow(10, count)));
		System.out.println(num==LastDigit?num+"  :-is AutoMorphicNumber":num+"  :-is Not AutoMorphic Number");
	}

}
