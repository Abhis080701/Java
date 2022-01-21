import java.util.Scanner;

public class StringArray {
public static void main(String []args)
{

	String arr[][] = new String[10][10];
	Scanner sc = new Scanner(System.in);
	int r= 2;
	int c =2;
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.println("Enter the String  arr["+i+"]"+"["+j+"]");
			arr[i][j] = sc.next();
		}
		
	}
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	
}
}

