//Name:Satish Rathod
//Roll No:MCA2649
//Module 4: Linked Lists
// Application of Linked Lists - List Implementation of an Ordinary Queue

import java.util.*;

//QNode Template
class QNode
{
	int data;
	QNode next;
	
	public QNode(int d)
	{
		this.data = d;
		this.next = null;
	}
}//end of the QNode

//Queue List
class LQueue
{
	QNode front;
	QNode rear;
	
	public LQueue()
	{
		front = null;
		rear = null;
	}
	//Enqueue
	public void Enqueue(int d)
	{
		QNode x = new QNode(d);
		
		if(front == null) // First Node in the Queue
		{
			front = x;
			rear = x;
		}
		else // Add x to the end of the Queue
		{
			rear.next = x;
			rear = x;
		}
		
	}//end of Enqueue

	//Display
	public void Display()
	{
		if(front == null)
		{
			System.out.println("\nQueue UnderFlow!");
		}
		else
		{
			QNode temp = front;
			System.out.print("\nQueue Contains: ");
			
			while(temp!=null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}//end of the display

	// Peek Front 
	public void PeekFront()
	{
		if(front == null)
		{
			System.out.println("Queue UnderFlow!");
		}
		else
		{
			System.out.print("\n\nElement At the Front: " + front.data);
		}
	}//end of the PeekFront

	// Peek Rear 
	public void PeekRear()
	{
		if(front == null)
		{
			System.out.println("Queue UnderFlow!");
		}
		else
		{
			System.out.println("\nElement At the Rear: " + rear.data);
		}
	}//end of the PeekRear

	//Dequeue
	public void Dequeue()
	{
		if(front == null)
		{
			System.out.println("Queue UnderFlow!");
		}
		else
		{
			int t = front.data;
			
			if(front == rear)
			{
				front =null;
				rear = null;
			}
			else
			{
				front = front.next;
			}
			System.out.print("\nElement removed: "+t);
			
		}
	}//end of Dequeue




}//end of the LQueue

class QList
{
	public static void main(String args[])
	{
		LQueue q = new LQueue();
		
		for(int i=1; i<=5; i++)
		{
			q.Enqueue(i*10);
			q.Display();
		}

		q.PeekFront();
		q.PeekRear();

		for(int i=1; i<=5; i++)
		{
			q.Dequeue();
			q.Display();
		}
		
	}//end of main

}//end of QList 
		