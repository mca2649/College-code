//Name:Satish Rathod
//Roll No:MCA2649
//Module 4: Linked Lists
// Application of Linked Lists - List Implementation of an Priority Queue

import java.util.*;

//Priority Queue Node Templete
class PQNode
{
	int data;
	int pri;
	PQNode next;
	
	public PQNode(int d, int p)
	{
		this.data = d;
		this.pri = p;
		this.next = null;
	}
	
}//end of the PQNode
//Priority Queue templete
class PriQue
{
	PQNode front;
	PQNode rear;

	public PriQue()
	{
		front = null;
		rear = null;
	}
	
   	//Enqueue
	public void Enqueue(int d, int p)
	{
		//make a new node
		PQNode x = new PQNode(d,p);

		//First Node in the Priority Queue -Return Control
		if(front == null)
		{
			front = x;	
			rear = x;
			return;
		}
		
		//Traqverse the Queue and fiind the correct place for x
		PQNode prev = null;
		PQNode temp = front;
		
		while(temp!=null && temp.pri < p)
		{
			prev = temp;
			temp = temp.next;
		}
		if(temp == front) //Front Node Insertion
		{
			x.next = front;
			front = x;
		}
		else if(temp == null) //Rear Node Insertion
		{
			rear.next = x;
			rear = x;
		}
		else  //Any Other Node
		{
			prev.next = x;
			x.next = temp;
		}
	}//end of Enqueue
}//end of PriQue

class PQueue
{
	public static void main(String args[])
	{
	
	
	}//end of the main
}//end of the 
