package ObjectOrientedProgramming;
class Student1
{
int id;
String name;
	Student1(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	 Student1(Student1 s ) {
		// TODO Auto-generated constructor stub
		 id = s.id;
		 name  = s.name;
		 
	}
	void Display()
	{
		System.out.println(id+"  "+name);
		
	}
}


public class assignonetoanousingConstructor {
	
public static void main(String[]arg)
{
	Student1 s1 = new Student1(111,"Abhishek");
	Student1 s2 = new Student1(s1);
	s1.Display();
	s2.Display();
}
}
