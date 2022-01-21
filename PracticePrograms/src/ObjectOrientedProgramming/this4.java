package ObjectOrientedProgramming;
// Calling parametrized constructor using default constructor by passing the parameter into the this(parameter);
public class this4 {
	this4()
	{
		this(11);
		System.out.println("Default Constructor");
		
	}
	this4(int n)
	{
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
this4 t44 = new this4(); 
	}

}
