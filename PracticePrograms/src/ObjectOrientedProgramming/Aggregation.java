package ObjectOrientedProgramming;

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double rs =  new cicle().area(5);
   System.out.println(rs);
	}

}



class Operation 
{
	
int square(int n)
{
	
return n*n;
}


}

class cicle
{
	Operation operation;
   double pi = 3.14;
   double area(int radius)
   {
	   operation = new Operation();
	   int res = operation.square(radius);
	return pi*res;   
   }
}
 