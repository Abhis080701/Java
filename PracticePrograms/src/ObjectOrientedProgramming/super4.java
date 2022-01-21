package ObjectOrientedProgramming;

class Person
{
int id;
String name;

Person(int id,String name)
{
this.id =id;
this.name = name;
}

}

class Emp extends Person
{
	float salary;
 Emp(int id,String name,float salary) {
	// TODO Auto-generated constructor stub
	 super(id,name);
	 this.salary = salary;
}	
 void Display()
 {
	 System.out.println(id+"  "+name+"  "+salary);
	 
 }

}


public class super4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e = new Emp(1, "Abhishek", 3000f);
e.Display();
	}

}
