package ObjectOrientedProgramming;

class Bank
{
int getRateOfInterest() {return 0;}	
}
  
class SBI extends Bank
{
int getRateOfInterest()	{return 8;}
}


class ICICI extends Bank
{
int getRateOfInterest() {return 9;}	
}

class AXIS extends Bank
{
int getRateOfInterest() {return 5;}	
}
public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SBI s = new SBI();
     ICICI i = new ICICI();
     AXIS a = new AXIS();
     System.out.println("SBI Rate of Interest is: "+s.getRateOfInterest());
     System.out.println("ICICI Rate of Interest is: "+i.getRateOfInterest());
     System.out.println("AXIS Rate of Interest is: "+a.getRateOfInterest());
     
	}

}
