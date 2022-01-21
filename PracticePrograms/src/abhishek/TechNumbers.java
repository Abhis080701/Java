package abhishek;

import java.util.Scanner;

public class TechNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp, firsthalf, secondhalf, digits = 0, sumofsquare = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numebr U want to Check...");
		n = sc.nextInt();
		temp = n;
		while (temp > 0) {
			digits++;
			temp /= 10;
		}
		if (digits % 2 == 0) {
			
			firsthalf = n % (int) (Math.pow(10, digits / 2));
			secondhalf = n / (int) (Math.pow(10, digits / 2));
			System.out.println("firsthalf: "+firsthalf+"  secondhalf: "+secondhalf);
	int f1 = firsthalf+secondhalf;
	int f2 = firsthalf+secondhalf;
			sumofsquare = (firsthalf + secondhalf) * (firsthalf + secondhalf);
			System.out.println("The SuMofSquare is: ("+ f1 +")*("+ f2 +") is= "+sumofsquare);
			System.out.println("If entered number"+ n +" is Equal to the sumofSquare "+sumofsquare+" Then its Called Tech Number");
			if (n == sumofsquare) {
				System.out.println("The Given Number " + n + " is TECH Number ");
			} else {
				System.out.println("The Given Number " + n + " is NOT TECH Number ");
			}
		}
		else
		{
			System.out.println("The Given Digits is Even Digits: "+n);
		}

	}
}
