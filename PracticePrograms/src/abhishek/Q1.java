package abhishek;

import java.util.Scanner;



public class Q1 {
	private int age;
public Q1(int intialAge){
	
	age = intialAge;
}
public void amIOld() {
	if(age<13 && age>0)
	{
	System.out.println("You are young.");
	
	}else if (age>=13 && age<18) {
		System.out.println("You are a teenager.");
	}else if(age>=18) {
		System.out.println("You are old.");
		
	}
	if(age<0) {System.out.println("Age is not valid, setting age to 0.");age=0;}
}
public void yearPass() {
	age++;
	System.out.println(age);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		Q1 q1 = new Q1(age);
		q1.amIOld();
	    q1.yearPass();
	

	}

}
