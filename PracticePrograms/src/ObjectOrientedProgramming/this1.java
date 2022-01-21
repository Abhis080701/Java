package ObjectOrientedProgramming;
// to refer a current class instance variable i.e.. if there is similar type of instance variable and parameter of an constructor
public class this1 {
	int num;
	String Name;
	// Constructor
	this1(int num,String Name)
	{
		this.num = num;
		this.Name = Name;
	}
	void Display() {
		System.out.println(num+"----"+Name);
		
		
	}
	public static void main(String [] args)
{
this1 t1 = new this1(1, "Hello");
	t1.Display();
}

}
