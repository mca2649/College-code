import java.util.*;

class FactorialImpl
{
	//Instance Declaration 
	int number;
	int fact = 1;

	//Getter/Setter
	public void set(int number)
	{
		this.number = number;
	}
	int get()
	{
	 	return number;
	}
	//factorial logic
	int factorialMethod()
	{
		while(number>=1)
		{
			fact = fact*number;
			number = number-1;
		}
		return fact;
	} 

	//print
	void print()
	{
		System.out.println("The Number :" + number);
	}	
}

class FactorialMain
{
	public static void main(String args[])
	{
		FactorialImpl obj = new FactorialImpl();
		obj.set(5);
		obj.get();
		obj.print();
		
		int res = obj.factorialMethod();
		System.out.println("Factorial of Number :" + res);
	}
}