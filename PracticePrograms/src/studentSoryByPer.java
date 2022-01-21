import java.util.Scanner;

import ObjectOrientedProgramming.interfaces;



class Student2
{
int roll_no;
String name;
float percentage;

public Student2(int roll_no,String name, float percentage) {
	// TODO Auto-generated constructor stub
	this.roll_no = roll_no;
	this.name = name;
	this.percentage =percentage;
	
}
public void Display() {
	System.out.print("Roll_No: "+roll_no+"   Name: "+name+"   Percentage: "+percentage);
	System.out.println();
}
public void sortByPercentage() {
	float MinPer= percentage;
	if(percentage<=MinPer)
	{
		System.out.println(MinPer);
		
	}
}
}

public class studentSoryByPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student2[] s1 = new Student2[20];
Scanner  sc = new Scanner(System.in);

System.out.println("Enter the Number of Objects You want to create");
int n =sc.nextInt();
for (int i = 1; i <=n; i++) {
	System.out.println("Enter the Data As\t 1)Rollno \t 2)Name \t 3)Percentage:\tOf an Student: ("+i+")");
	s1[i] = new Student2(sc.nextInt(), sc.next(), sc.nextFloat());
}
		System.out.println("List Of an Student is: ");
for (int i = 1; i <= n; i++) {
	System.out.print("Student ("+i+")");
	s1[i].Display();
	System.out.println();
}
	
for (int i = 1; i <= n; i++) {
	s1[i].sortByPercentage();
}
		
		
	}

}
