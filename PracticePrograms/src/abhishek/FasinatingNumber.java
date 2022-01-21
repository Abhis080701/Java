package abhishek;

import java.util.Scanner;

public class FasinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int n1 = num*2;
		int n2  = num*3;
		String Concat = num+""+n1+n2;
		boolean found = true;
		for(char c='1';c<='9';c++)
		{
			int count=0;
			for(int i=0;i<Concat.length();i++)
			{
				char ch = Concat.charAt(i);
				if(ch==c)
				count++;
				
			}
			
			if(count>1 || count==0)
			{
				found = false;
				break;
			}
		}
		
		if(found)
		{
			System.out.println(num+" is Fasinating Number.");
		}
		else
		{
			System.out.println(num+" is Not Fasinating Number.");
		}
		
	}

}
