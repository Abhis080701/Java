package ObjectOrientedProgramming;
// pass an argument in method
public class this5 {
void m(this5 t) {
	System.out.println("M is Invoked");
	
}
void p() {
	m(this);
	System.out.println("P is invoked");
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
this5 t5 = new this5();
t5.p();
	}

}
