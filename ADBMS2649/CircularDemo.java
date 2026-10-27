//Name:- Satish Rathod
//Roll No:- 2649
//LinkedList

// 2) Circular Linked List
// Design a Node class
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class CircularLinkedList
{
	//add a node
	private Node last; // last.next is head
	public void insertFirst(int data)
	{
		Node n = new Node(data);
		if(last = null) // list is Empty
		{
			last = n;
		 	last.next = head;
		}
		else
		{
			n.next = last.next;
			last.next = n;	
		}
	
	}
}
class CircularDemo
{
	public static void main(String args[])
	{
	}
}