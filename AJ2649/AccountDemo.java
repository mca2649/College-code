import java.util.Scanner;
class BankAccount
{
	//Instance Variable
	private int actNo;
	private String actName;
	private float balance;

	//Constructor
	BankAccount(int actNo, String actName, float balance)
	{
		this.actNo=actNo;
		this.actName=actName;
		this.balance=balance;
	}

	//Getter/Setter
	int getActNumber() // get Account Number 
	{
		return actNo;
	}
	String getActName() // get Account Name 
	{
		return actName;
	}
	void setActName(String actName) // set Account Name
	{
		this.actName=actName;
	}
	float getBalance() // get Account Balance 
	{
		return this.balance;
	}
		
	//Deposit
	void deposit(float amount)
	{
		balance = balance + amount;
	}

	//Withdraw
	boolean withdraw(float withdrawAmount)
	{
		if(this.balance>=withdrawAmount) 		
		{
			this.balance = this.balance - withdrawAmount;
			return true;           		
		}
		else
		{
			System.out.println("Insufficent Funds");
			return false;
		} 
	}

	//Tansfer 
	boolean transferMoney(BankAccount target,float amount)
	{
     		if(withdraw(amount))
		{
			target.deposit(amount);
		        return true;

		}
		else
		{
			return false;
		}

	}

           
}
class AccountDemo
{
	public static void print(BankAccount temp)
	{
		System.out.println(temp.getActNumber());
		System.out.println(temp.getActName());
		System.out.println(temp.getBalance());
	}
	public static void main(String args[])
	{
		
		System.out.println("Welcome to my Bank");
		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount(101,"Satish",2500);
		BankAccount bank2 = new BankAccount(102,"Khushi",1000);
		bank.setActName("Vishal");

		System.out.println("========Initial Account=========");
		print(bank);

		bank.deposit(3000); // Deposit Method create.
		
		System.out.println("========After Deposit Account=========");
		print(bank);
		
		System.out.println("Enter the withdraw Amount");
		float withdrawAmt = sc.nextFloat();
		bank.withdraw(withdrawAmt); //withdraw Method Creation

		System.out.println("========After Withdraw Account=========");
		print(bank);

		System.out.println("========Target Account Info=========");
		print(bank2);

		System.out.println("========Target Account Info after Transfer=========");
		System.out.println("Enter the Amount to transfer");
		float transferAmt=sc.nextFloat();
		bank.transferMoney(bank2,transferAmt);
		print(bank2);

		System.out.println("========Source Account Info after Transfer=========");
		print(bank);

	}
}