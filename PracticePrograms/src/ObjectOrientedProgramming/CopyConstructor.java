package ObjectOrientedProgramming;

class Student2
{
int id;
String name;
 Student2(int i,String n) {
	// TODO Auto-generated constructor stub
	 id = i;
	 name = n;
}
 Student2(){}
 void Display() {
	 System.out.println(id+"------"+name);
	 
 }

}


public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student2  s11= new Student2(32,"Abhishek");
Student2 s22 = new Student2();
s22.id = s11.id;
s22.name  = s11.name;
s11.Display();
s22.Display();

		
		
	}

}
