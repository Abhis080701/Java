package ObjectOrientedProgramming;




//Parent Class
class P1
{
	void P() {
		System.out.println("Parent class");
		
	}
	
	
}
//Child Class of P1
class C1 extends P1
{
	
	void C() {
		
		System.out.println("Child of Parent Class ");
		
	}
	
	
}



public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C1 c1= new C1();
c1.P();
c1.C();

	}

}



