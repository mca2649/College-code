import java.util.*;
class ArratQueue
{
	//instance variables
	private int[] data;
	private int front;
	private int rear;
	private int capacity;

	ArratQueue(int size)
	{
		capacity=size;
		data = new int[capacity];
		front=-1;
 		rear=-1;
	}

	//add method to enque
	public void enqueue(int ele)
	{
		// 1) Check whether the queue is full
		if(rear==capacity-1)
		{
			System.out.println("Element can not be added! Queue is full!");
			return;
		}
		// 2) add first element in the queue
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else // 3) Any other element
		{
			rear++;
		}
		data[rear]=ele; //4) add the data
		System.out.println("Element Added");

	}
	// Method to dequeue the data
       	public void dequeue()
	{
    		// 1) is the queue empty
    		if(front==-1)
    		{
        		System.out.println("The Queue is Empty!");
        		return;
    		}

    		// 2) fetch and display data
		int x=data[front];
    		System.out.println("Element Removed: " + x);

    		// 3) for ant other element
    		if(front==rear)
    		{
        		front = -1;
        		rear = -1;
    		} 
    		else
    		{
        		front++;
    		}
	}

	// peek front
	public void peekFront()
	{
		if(front==-1)
		{
			System.out.println("The Queue is Empty!");
        		return;
		}
		System.out.println("Front of the Queue:" + data[front]);
	}

      	// peek rear
	public void peekRear()
	{
		if(rear==-1)
		{
			System.out.println("The Queue is Empty!");
        		return;
		}
		System.out.println("Rear of the Queue:" + data[rear]);
	}


	void display()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty!");
		}
		else
		{
			System.out.println("Elements in Queue!");

			for(int i=front;i<=rear;i++)
			{	
				System.out.println(" " + data[i]);
			}
			System.out.println();
		}
	}
}
class  QueueImpl
{
	public static void main(String args[])
	{
		ArratQueue a1=new ArratQueue(5);
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Array Based Queue");
			System.out.println("1-Enqueue an element");
			System.out.println("2-Dequeue an element");
			System.out.println("3-Display the Queue");
			System.out.println("4-Peek Front");
			System.out.println("5-Peek Rear");
			System.out.println("6-Exit");

			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the element");
					int ele=sc.nextInt();
					a1.enqueue(ele);
					break;
				case 2:
					a1.dequeue();
					break;
				case 3:
					a1.display();
					break;
				case 4:
					a1.peekFront();
					break;
				case 5:
					a1.peekRear();
					break;
				case 6:
					System.out.println("Exit");
					break;
				default:
					System.out.println("incorrect choice");
					break;
			}
		}while(ch!=6);
		
	}

}