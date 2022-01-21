class Try
{
	
}
public class Demo1 {
//instance variable
	Try try1;
	byte by;
	int aa;
	short sh;
	long L;
	float f;
	double d;
	
	String ssString;
	//static variables.
static int b;
static byte bb;
static short ss;
static long ll;
static float ff;
static double dd;
static String SS;
static Try try2;

static
{
	
System.out.println("The Static intializing block is called at the time class loading first ie. demo1: ");	

}
int aa1;
public Demo1() {
	// TODO Auto-generated constructor stub
	System.out.println("the Instance intializer block is invoked when Object is created and also before contructor is invoked: ");
System.out.println("Constructer is Called...          aa1:-    "+aa1);

}
//instance inatializer block
{aa1 =10; }


public void InstanceM()
{
	System.out.println("Intance Method is Called");
}
public static void StaticM() {
	
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5; 
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println("---------------");
		
		int a =10; 
		System.out.println(a++ + a++);
		System.out.println(a);
		/*
		 * a=10
		 * a++ + a++ 
		 * here the a post increment is done so a beacomes before its increment
		 * a++ = 10
		 * then a  incremented to 11 beacuse its post increment i.e. the value use first then incremented
		 * 
		 *  a++ = 11
		 *  a++ + a++ = 10 + 11 = 21
		 *  
		 *  and 2nd operands post increment is happen then a values beacome 12
		 *  a = 12
		 * 
		 * 
		 */
		System.out.println("---------------");
		

		System.out.println(a-- - a--);
		System.out.println(a);
		
		System.out.println("---------------");
		

		int j=10;
		
		System.out.println( ++j + --j);
         --j;
         System.out.println(j);
         /*j=10
 		 * 
 		 * ++j + --j = 11+10 =  21
 		 * now j beacomes j=10
 		 * --j = 9
 		 * j=9
 		 */
		System.out.println("---------------");
		
		Demo1 demo1 = new Demo1();
		System.out.println("The Default values of all instances are as Follow: ");
		System.out.println("For byte: "+demo1.by);
		System.out.println("For short: "+demo1.sh);
		System.out.println("For int: "+demo1.aa);
		System.out.println("For long: "+demo1.L);
		System.out.println("For float: "+demo1.f);
		System.out.println("For double: "+demo1.d);
		System.out.println("For String: "+demo1.ssString);
		System.out.println("For Other class reference :"+demo1.try1);
	 System.out.println();
		demo1.InstanceM();
		
		System.out.println("The Default values of all Static variable at the first time of class loading ");
		System.out.println("For byte: "+Demo1.bb);
		System.out.println("For short"+Demo1.ss);
		System.out.println("For int: "+Demo1.b);
		System.out.println("For long: "+Demo1.ll);
		System.out.println("For float: "+Demo1.ff);
		System.out.println("For double: "+Demo1.dd);
		System.out.println("For String: "+Demo1.SS);
		System.out.println("For Other class reference :"+Demo1.try2);
	
		

	}
}