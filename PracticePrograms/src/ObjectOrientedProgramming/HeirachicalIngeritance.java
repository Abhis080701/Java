package ObjectOrientedProgramming;

public class HeirachicalIngeritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d = new Dog();
d.eat();
d.bark();
System.out.println();
Cat c  = new Cat();
c.eat();
c.meo();


	}

}


class Animals
{
void eat()	
{
System.out.println("Eating..... ");	
}
}

class Dog extends Animals
{
void  bark()
{
	System.out.println("Barking.....");

}
}

class Cat extends Animals
{
	
void meo()
{
System.out.println("Meowing....");	
}
}