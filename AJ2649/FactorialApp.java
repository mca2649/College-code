import java.util.*;
class FactorialApp
{
	public static void main(String [] args)
	{
		
		//Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();

		//local variable
		int fact = 1;

		//logic
 		while(number>=1)
		{
			fact = fact*number;
			number = number-1;
		}

		//print
		System.out.println("Factorial Number :" + fact);
	}
}