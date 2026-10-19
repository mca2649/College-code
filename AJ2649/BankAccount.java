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
	//Deposit
	//Withdraw
	//Transfer
	//print
	void print()
	{
		System.out.println(actNo);
		System.out.println(actName);
		System.out.println(balance);
	}

}
class AccountDemo
{
	public static void main(String args[])
	{
		System.out.println("Welcome to my Bank");
		BankAccount bank = new BankAccount(1,"Satish",50000);
		bank.print();
	}
}