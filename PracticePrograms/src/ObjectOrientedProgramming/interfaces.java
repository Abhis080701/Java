package ObjectOrientedProgramming;
interface Bank1
{

	float getRateOfInterest();
	
}

class SBI1 implements Bank1{
	public float getRateOfInterest() {
		return 6.8f;
		
	}
	
}

class ICICI1 implements Bank1{
	public float getRateOfInterest() {
		return 9.8f;
		
	}
	
}

class AXIS1 implements Bank1{
	public float getRateOfInterest() {
		return 7.0f;
		
	}
	
}

public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Bank1 bank1 = new SBI1();
Bank1 bank2 = new ICICI1();
Bank1 bank3 = new  AXIS1();

System.out.println(bank1.getRateOfInterest());

System.out.println(bank2.getRateOfInterest());

System.out.println(bank3.getRateOfInterest());


	}

}
