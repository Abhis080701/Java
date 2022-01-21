package ObjectOrientedProgramming;
// to invoke the current class method
public class this2 {
void m() {
	System.out.println("Invoked By using this keyword");	
}
void n()
{
System.out.println("n method");	
this.m();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   this2 n1 = new this2();
    n1.n();	
	}

}
