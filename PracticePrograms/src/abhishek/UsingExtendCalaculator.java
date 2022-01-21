package abhishek;
//Simple Calculator. Using Class
class Calculator {
	public int result;

	public void add(int n1, int n2) {
		result = n1 + n2;
		System.out.println("The Additon of Two Given Number is:" + result);
	}

	public void sub(int n1, int n2) {
		result = n1 - n2;
		System.out.println("The Substraction Of Two Number is:" + result);
	}

	public void mul(int n1, int n2) {
		result = n1 * n2;
		System.out.println("The Multiplication Of Two Number is:" + result);

	}

}
//Using Extend KeyWord
class MyCalculator extends Calculator
{
	public void Div(int n1,int n2)
	{
	   float result = n1/n2;
	   System.out.println("The Division of two Given Number is:"+result);
	}
	

	public void Mod(int n1,int n2)
	{
	    result = n1%n2;
	   System.out.println("The Modulo of two Given Number is:"+result);
	}
	
}
public class UsingExtendCalaculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   Creating the Object of the Child class i.e..(MyCalculator) which extends From the Parent class i.e..(Calculator)
	MyCalculator Cal = new MyCalculator();
	Cal.add(1, 2);
	Cal.sub(3, 3);
	Cal.mul(3, 3);
	Cal.Div(4, 3);
	Cal.Mod(4, 3);
	}

}
