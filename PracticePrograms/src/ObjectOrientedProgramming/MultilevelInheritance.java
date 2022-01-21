package ObjectOrientedProgramming;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M3 m3 = new M3();
		m3.m1();
		m3.m2();
		m3.m3();
	}

}


//parent class of M1 Child class
class M1 {
	void m1() {

		System.out.println("Parent Class");

	}

}

// child class of an M1
class M2 extends M1 {

	void m2() {

		System.out.println("Child class of an M1");

	}
}


// child class of an M2 class
class M3 extends M2 {

	void m3() {
		System.out.println("Child Class of an M2(parent class)");

	}
}

/*
 *
 *
 * Parent Class Child class of an M1 Child Class of an M2(parent class)
 * 
 */
