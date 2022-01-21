package ObjectOrientedProgramming;

public class MethodOverloading {
	static int add(int a,int b)
	{
		return a+b;
	}
static float add(float a,float b,float c)
{
return a+b+c;	
}
static double add(double a,double b) {return a+b;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MethodOverloading.add(1, 2));
System.out.println(MethodOverloading.add(1.2f, 4.0f, 5.0f));
System.out.println(MethodOverloading.add(12.0, 1.0));
	}

}
