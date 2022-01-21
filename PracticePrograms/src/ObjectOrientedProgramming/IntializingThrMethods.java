package ObjectOrientedProgramming;
class Stduent1
{
	int id;
	String Name;
	void insert(int n,String s)
	{
		id = n;
		Name = s;
	}
	void Display()
	{
		System.out.println(id+" "+Name);
	}
}
public class IntializingThrMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stduent1 s1 = new Stduent1();
		Stduent1 s2 = new Stduent1();
		Stduent1 s3 = new Stduent1();
		s1.insert(1, "Abhi");
		s2.insert(2, "OM");
		s3.insert(3, "Jay");
		s1.Display();
		s2.Display();
		s3.Display();
   
	}

}
