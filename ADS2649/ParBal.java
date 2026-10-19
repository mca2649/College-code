 //Name:- Satish Rathod
//Roll No:- 2649
//Module 3:- Stacks
//Stack Application 1: Parenthesis Balancing

class ParBal
{
	public static void main(String[] args)
	{
		String expr = "(a+b))" ; 
		
		if(isBalanced(expr))
		{
			System.out.println("the parenthesis are balanced in" + expr);
		}
			
		else
		{
			System.out.println("the parenthesis are not balanced" + expr);
		}
	}//end

	public static Boolean isBalanced(String ex)
	{
		//Create an array with a tos to simulate a stack
		char[] stack = new char[ex.length()];
		int tos = -1;
		
		//scan the expression
		for(int i=0; i<ex.length(); i++)
		{
			char ch = ex.charAt(i);
			
			if(ch=='(')       //encounter an (push it on the stack
			{
				tos++;
				stack[tos]=ch;
			}
			else if(ch==')')  //encounter a ) pop the stack
			{
				if(tos==-1) //no matching parenthesis
				{
					return false;
				}
				tos--;   //pop the stack
			}
		}// end of for i
			
		//If the stack is empty
		return tos==-1;
	}//end of  the isBalanced
			
}//end
