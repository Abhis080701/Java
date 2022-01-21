package abhishek;

public class CreateObjectEx33 implements Cloneable {
protected Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
void show()
{
	System.out.println("Hi Java");
}
String str = "New Object Created";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CreateObjectEx33   Obj1 = new CreateObjectEx33();
try
{
	CreateObjectEx33 Obj2 = (CreateObjectEx33)Obj1.clone();
	System.out.println(Obj2.str);
	Obj2.show();
}
catch(CloneNotSupportedException e)
{
	e.printStackTrace();
}
	}

}
