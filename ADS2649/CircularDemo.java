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
		if(last == null) // list is Empty
		{
			last = n;
		 	last.next = last;
		}
		else
		{
			n.next = last.next;
			last.next = n;	
		}
	
	}
	
	// display method
	public void display()
	{
		if(last == null)
		{
			System.out.println("List is Empty!!");
		}
		Node temp=last.next;
		do
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}while(temp != last.next);
		System.out.println("head");
	}


	// insert last
	public void insertLast(int data)
	{
		insertFirst(data);
		last = last.next;	
	}
	
	//count of elements
	public int count()
	{
		int count = 0;
		if(last==null)
		{
			return count;
		}
		Node temp = last.next;
		do
		{
			count++;
			temp = temp.next;
		}while(temp != last.next);
		return count;

	}
	
	//delete
	public boolean delete(int key)
	{
		if(last==null)
		return false;
		Node curr = last.next;
		Node prev = last;
		do
		{
			if(curr.data == key)
			{
				prev.next = curr.next;
				return true;
			}
			prev=curr;
			curr = curr.next;
		}while(curr != last.next);
		return false;
	}

}
class CircularDemo
{
	public static void main(String args[])
	{
		CircularLinkedList l1 = new CircularLinkedList();										l1.insertFirst(10);
		l1.display();
		l1.insertFirst(20);
		l1.display();
		l1.insertFirst(30);
		l1.display();
		l1.insertLast(40);
		l1.display();
		System.out.println("Count:"+l1.count());
		System.out.println("Deleted:"+l1.delete(40));
		l1.display();
	}
}