package ObjectOrientedProgramming;
// super keyword is used to invoked parent class constructor
class A5
{
	A5()
	{
		System.out.println("Parent Class Constructor");
		
	}
}
class A6 extends A5{
	A6()
	{
		
		super();
		System.out.println("Child class A6");
		
	}
	
}
public class super3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A6 a6 = new A6();

	}

}
