package abhishek;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123, rev = 0;
		while (num != 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The Reverse Number is: " + rev);
		
		int rev1 = 0,num1=123;
	
		for (; num1 != 0; num1 = num1 / 10) {
			int remainder1 = num1 % 10;
			rev1 = rev1 * 10 + remainder1;
		}
		System.out.println("The Reverse Number is USing For Loop: " + rev1);
	}

}
