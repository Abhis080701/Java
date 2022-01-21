package abhishek;

public class CreateObjectEx3 implements Cloneable{
void show()
{
	System.out.println("JAVA");
}
	protected Object clone() throws CloneNotSupportedException
{
	return super.clone();
}

String str="Creating New Object!";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateObjectEx3 Obj1 = new CreateObjectEx3();
//		Creating the new object  of the Obj1 using clone() method
		try
		{
			CreateObjectEx3 obj2 = (CreateObjectEx3)Obj1.clone();
			System.out.println(obj2.str);
			obj2.show();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
