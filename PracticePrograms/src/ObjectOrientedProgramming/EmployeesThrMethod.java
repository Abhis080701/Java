package ObjectOrientedProgramming;
class Employee
{
	int eid;
	String Ename;
	float Salary;
	void setDataEmployee(int i,String E,float S)
	{
		eid = i;
		Ename = E;
		Salary = S;
	}
	void Display()
	{
		System.out.println(eid+" "+Ename+" "+Salary);
	}
}
public class EmployeesThrMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee E1 = new Employee();
Employee E2 = new Employee();
E1.setDataEmployee(1, "ABhishek", 25000);
E2.setDataEmployee(2, "OM", 4000);
E1.Display();
E2.Display();

	}

}
