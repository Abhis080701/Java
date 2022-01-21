package ObjectOrientedProgramming;


class Animal1
{
void eat()
{
System.out.println("Eating....");	
}
}
// super keyword is used to invoke parent class Method
class  Dog1 extends Animal1
{
void eat() {System.out.println("Eating bread...");}	
void bark() {System.out.println("Barking....");}
void work()
{
super.eat();
bark();
}
}
public class super2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog1 d1 = new Dog1();
d1.work();
	}

}
