
import java.util.Scanner;

public class Array2d {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		Scanner scanner = new Scanner(System.in);
		int r = 2;
		int c = 2;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("Enter the Element  arr[" + i + "][" + j + "]");
				arr[i][j] = scanner.nextInt();
			}

		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
