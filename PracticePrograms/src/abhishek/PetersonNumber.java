package abhishek;
import java.io.*;
import java.util.Scanner;
public class PetersonNumber {
static long[] factorial = new long[] {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
static boolean petersonNum(int num)
{
	int temp= num;
	int sum = 0;
	while(temp>0)
	{
		int digit  = temp%10;
		sum +=factorial[digit];
		temp/=10;
	}
	return (sum==num);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number");
   int n = sc.nextInt();
   if(petersonNum(n))
   {
	   System.out.println("The Given Number is peterson Number: ");
   }
   else
   {
	   System.out.println("The Given Number is Not peterson Number: ");  
   }
	}

}
