package ObjectOrientedProgramming;

public class Aggregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Address a = new Address("Pune", "Maharshatra", "india");
 Employee1 e1 = new Employee1(1, "Abhishek", a);
 e1.Display();
	}

}

class Address {
	String city, state, country;

	public Address(String city, String state, String country) 
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Employee1 {
	int id;
	String name;
	Address address;

	public Employee1(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void Display()
	{
		System.out.println(id+"-----"+name);
		System.out.println(address.city+"   "+address.state+"  "+address.country);
	}

}
