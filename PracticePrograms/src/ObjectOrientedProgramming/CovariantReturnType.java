package ObjectOrientedProgramming;

class A1 {

	A1 foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the Class A1");

	}
}

class A2 extends A1 {
	@Override
	A2 foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the Class A2");
	}
}

class A3 extends A2 {
	@Override
	A3 foo() {
		
		return this;
	}

	void print() {
		System.out.println("Inside The Class A3");
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		a1.foo().print();
		A2 a2 = new A2();
		a2.foo().print();
		A3 a3 = new A3();
		a3.foo().print();
	}

}
