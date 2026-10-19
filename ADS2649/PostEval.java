//Name:- Satish Rathod
//Roll No:- 2649
//Module 3:- Stacks
//Stack Application of stack 2: Postfix Evaluation

import java.util.*;

class PostEval
{
	public static void main(String[] args)
	{
		String expr = "51+8*2+" ; //Test expression single digits
 		int res = evaluatePostfix(expr);
 		System.out.println("Result of evaluation of " + expr + " is: " + res);
	}//end of main

   	public static int evaluatePostfix(String ex)
	{
		
		//Create a integer stack of TOS
		int[] stack = new int[ex.length()];
		int tos = -1;

		//Loop through each character of postfix expression
		for(int i = 0; i<ex.length(); i++)
		{
			char ch = ex.charAt(i);

			//If the character is a number push it on the stack
			if(Character.isDigit(ch))
			{
				tos++;
				stack[tos]= ch - '0'; // Convert char to int 
			}
			else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
			{
				int op2 = stack[tos--];//Pop 2nd operand
				int op1 = stack[tos--];//Pop 1st operand
				
				int res = 0;
				switch(ch)
				{
					case '+' : 
							res = op1 + op2;
							break;

					case '-' :
							res = op1 - op2;
							break;

					case '*' :
							res = op1 * op2;
							break;

					case '/' :
							res = op1 / op2;
							break;
				}//end of switch

				//push res back on the stack
				tos++;
				stack[tos] = res;
			}//end of else 

		}//end of for i
		//Final answer at the tos
		return stack[tos];

	}//end of evaluatePostfix
			
}//end of the class
