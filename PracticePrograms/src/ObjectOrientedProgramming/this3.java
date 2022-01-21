package ObjectOrientedProgramming;

public class this3 {
	this3() {
		System.out.println("First");
	}

	this3(int x) {
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this3 t3 = new this3(10);

	}

}
