package abhishek;

class Fibonacci {
	int n1 = 0, n2 = 1, n3,count;

	public Fibonacci(int count) {

		this.count = count;
	}

	void Show() {
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; i++) {
			 n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}

public class FibonacciSeriesP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1, count = 10, n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}
		
		System.out.println();
		
		Fibonacci F = new Fibonacci(11);
		F.Show();
	}

}
