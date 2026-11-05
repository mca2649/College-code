//Name:Satish Rathod
//Roll No:MCA2649
//Module 4: Linked Lists
// Application of Linked Lists - Addition of Polynomial

import java.util.*;
//Node Template
class PNode
{
	int coeff;
	int exp;
	PNode next;

	PNode(int c,int e)
	{
		this.coeff = c;
		this.exp= e;
		this.next = null;
	}
}//end of pnode 

//List Template
class Polynomial
{
	PNode head;
	
	//Insert a node in order of exponent
	void Insert(int coeff,int exp)
	{
		PNode t = new PNode(coeff,exp);
		
		//If the list is empty or exponent is greater than head
		if(head==null || exp>head.exp)
		{
			t.next = head;
			head = t;
			return;
		}

		//Traversal
		PNode temp = head;
		PNode prev = null;
		
		while(temp!=null && temp.exp>exp)
		{
			prev = temp;
			temp = temp.next;
		}
		prev.next = t;
		t.next = temp;
		
			
	}//end of Insert

	//Display the polynomial
	void Display()
	{
		if(head == null)
		{
			System.out.println("Empty Polynomial");
			return;
		}
		
		PNode temp = head;
		while(temp!=null)
		{
			System.out.print(temp.coeff +"x^"+temp.exp);
			if(temp.next!=null)
			{
				System.out.print(" + ");
			}
			temp = temp.next;
		}
	}//end of display

	static Polynomial addPolynomial(Polynomial p1, Polynomial p2)
	{
		Polynomial result = new Polynomial();
		
		PNode a = p1.head;
		PNode b = p2.head;
		
		while(a!=null && b!=null)
		{
			if(a.exp == b.exp)
			{
				int sum = a.coeff + b.coeff;
				if(sum!=0)
				{
					result.Insert(sum,a.exp);
				}
				a = a.next;
				b = b.next;
			}
			else if(a.exp > b.exp)
			{
				result.Insert(a.coeff,a.exp);
				a = a.next;
			}
			else
			{
				result.Insert(b.coeff,b.exp);
				b = b.next;
			}
		}//end of while
		
		//add any other remaonon terms
		while(a!=null)
		{
			result.Insert(a.coeff,a.exp);
			a= a.next;
		}
		while(b!=null)
		{
			result.Insert(b.coeff,b.exp);
			b= b.next;
		}
		return result;

	}//end of addPolynomial
}//end of Polynomial

class AddP
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		
		System.out.println("Enter the number of terms in the first Polynomial. ");
		int n1 = sc.nextInt();
		System.out.println("Enter each terms as: coefficient exponent ");
		
		for(int i=0;i<n1;i++)
		{
			int c = sc.nextInt();
			int e = sc.nextInt();
			p1.Insert(c,e);
		}

		System.out.println("Enter the number of terms in the Second Polynomial. ");
		int n2 = sc.nextInt();
		System.out.println("Enter each terms as: coefficient exponent ");
		
		for(int i=0;i<n2;i++)
		{
			int c = sc.nextInt();
			int e = sc.nextInt();
			p2.Insert(c,e);
		}
		
		System.out.print("Polynomial 1: ");
		p1.Display();

		System.out.print("\nPolynomial 2: ");
		p2.Display();

		Polynomial res = Polynomial.addPolynomial(p1,p2);

		System.out.print("\nResult: ");
		res.Display();
	}//end of the main
}