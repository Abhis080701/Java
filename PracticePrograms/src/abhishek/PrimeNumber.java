package abhishek;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=0,flag=0;
int n=4;
m = n/2;
if(n==0||n==1)
{
	System.out.println(n+" is Not Prime Number");
}
else
{
	for(int i=2;i<=m;i++)
	{
		if(n%i==0)
		{
			System.out.println(n+" is not prime number");
			flag =1 ;
			break;
		}
	}
}
if(flag==0) {System.out.println(n+" is a Prime Number");}
	}

}
