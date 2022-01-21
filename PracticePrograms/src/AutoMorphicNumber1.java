import java.util.*;

public class AutoMorphicNumber1 {
	static boolean isAutoMorphic(int num) {
		int square = num * num;
		while (num > 0) {
			if (num % 10 != square % 10)
				return false;
			num /= 10;
			square /= 10;

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Check Whether is AutoMorphic Or Not: ");
		int num = sc.nextInt();
		System.out.println(isAutoMorphic(num)?"Given Number is AutoMorphicNumber":"Givent Number is Not a AutoMorphicNumber");
	}

}
