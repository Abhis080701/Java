package abhishek;

public class FibonacciSeriesRecursion {
	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacii(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacii(count - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		System.out.print(n1 + " " + n2);
		printFibonacii(count - 2);
	}

}
