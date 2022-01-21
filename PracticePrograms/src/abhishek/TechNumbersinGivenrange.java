package abhishek;

public class TechNumbersinGivenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("The Tech Number From 1 to 100000000 is: ");
for(int i=1;i<=900000000;i++)
{
	int p1 = i%100;
	int p2 = i/100;
	int sum = p1+p2;
	if(i==(sum*sum))
	{
		System.out.println(i);
	}
}
	}

}
