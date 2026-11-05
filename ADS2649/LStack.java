//Name:Satish Rathod
//Roll No:MCA2649
//Module 4: Linked Lists
// Application of Linked Lists - List Implementation of a Stack

import java.util.*;

class SNode
{
	int data;
	SNode next;

	public SNode(int d)
	{
		this.data= d;
		this.next = null;
	}
}//end of SNode

//List Template for Stack
class SList
{
	SNode tos;
	
	public SList()
	{
		tos = null;
	}
	
	//push operation
	public void Push(int d)
	{
		SNode x = new SNode(d);
		
		if(tos == null)
		{
			tos = x;
		}
		else
		{
			x.next = tos;
			tos = x;
		}
		
	}//end of the push

	//POP operation
	public void Pop()
	{
		if(tos == null)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			int t = tos.data;
			tos = tos.next;
		
			System.out.println("Popped element: " + t);
		}
	}//end of the pop

	//Display
	public void Display()
	{
		if(tos == null)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			SNode temp = tos;
			
			System.out.println("Stack Contains!");
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}//end of the Display

	//Peek
	public void Peek()
	{
		if(tos == null)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			System.out.println("Element at the TOS: " + tos.data);
			
		}
	}//end of the Peek
}//end of SList

class LStack
{
	public static void main(String args[])
	{
		SList s = new SList();
		
		for(int i=1; i<=5; i++)
		{
			s.Push(i*10);
			s.Display();
		}

		s.Peek();
		
		for(int i=1; i<=5 ; i++)
		{
			s.Pop();
			s.Display();
		}
		s.Pop();
	}//end of the main function

}//end of the main class



