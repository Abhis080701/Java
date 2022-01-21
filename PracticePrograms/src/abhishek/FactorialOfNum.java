package abhishek;

import java.util.Scanner;

public class FactorialOfNum {
static int FactorialRecursion(int n)
{
	if(n==0)
	return 1;
	else
	return (n*FactorialRecursion(n-1));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("The Factorial Of a " + num + " is " + fact);
		 
		System.out.println("Enter the Number(Recursion)");
		int num1 = sc.nextInt();
		System.out.println("The Factorial Of a " + num1 + " Using recursion is " + FactorialRecursion(num1));
	}
	

}
