package ObjectOrientedProgramming;

class Account {
	int acc_no;
	String Name;
	float amount;

	void insert(int a, String N, float amt) {
		acc_no = a;
		Name = N;
		amount = amt;
	}

	void Deposit(float amt) {
		amount += amt;
		System.out.println(amt + " Deposited ");

	}

	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficent Amount ");
		} else {
			amount = amount - amt;
			System.out.println(amt + "Withdraw");
		}
	}

	void CheckBalance() {
		System.out.println("Balance is: " + amount);
	}

	void Display() {
		System.out.println(acc_no + " " + Name + " " + amount);
	}
}

public class BankingDepositAndWithDram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account A1 = new Account();
		A1.insert(1111, "Abhishek", 3400);
		A1.CheckBalance();
		A1.Deposit(1000);
		A1.CheckBalance();
		A1.withdraw(400);
		A1.CheckBalance();
		A1.Display();
	}

}
