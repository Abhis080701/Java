package ObjectOrientedProgramming;
class Student3
{
int id;
String name;
// Its get the memory at time of class loading once 
static String college ="V.P.A.S.C";
Student3(int i,String n)
{
	id =i;
	name = n;

}

void Show()
{
System.out.println(id+"----"+name+"----"+college);	
}
}
public class staticInstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Student3.college);
		//creating the Instance of an class Student2.
		Student3 s1= new Student3(32,"Abhishek Dipak Suryawanshi");
		Student3  s2 = new Student3(31,"Abhijeet Ajinath sukhre");
		s1.Show();
		s2.Show();
		
		
	}

}
