package ObjectOrientedProgramming;
// super() keyword is user to refer immediate parent class instance variable
class AA
{
String name="Suryawanshi"; 	
}

class BB extends AA
{
	String name = "Abhishek";
	void printName()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
}


public class super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
BB bb = new BB();
bb.printName();

	}

}
