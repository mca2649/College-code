class CircularQueue
{
	int[] data;
	int front;
	int rear;
	int capacity;

	//define constructor
	CircularQueue(int size)
	{
		this.capacity=size;
		data = new int[capacity];
 		rear=-1;
		front=-1;
	}

	//insert an element
	void enqueue(int ele)
	{
		//check whether queue is full
		if((rear+1)% capacity == front)
		{
			System.out.println("Queue is Full");
			return;
		}
		//insert first element
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		// any other element including wrap around
		else
		{
			rear=(rear+1)% capacity;
		}
		// store the value
		data[rear]=ele;
		System.out.println("Element Added:"+ele);
	}

	//remove an element
	void dequeue()
	{
		// check whethe the queue us empty
		if(front== -1)
		{
			System.out.println("Queue is Full");
			return;
		}
		// remove the element
		System.out.println("Element removed:"+data[front]);
		// update the value of front
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			front=(front+1)%capacity;
		}
	}
	//print
	void display()
	{
		if(front== -1)
		{
			System.out.println("Queue is Full");
			return;
		}
		System.out.println("Queue elements....");
		int i=front;
		while(true)
		{	
			System.out.print(data[i]+" ");
			if(i==rear)
			{
					break;
			}
			i=(i+1)	%capacity;
		}
		System.out.println();
	}

}
class  CircularQueueImpl
{
	public static void main(String args[])
	{
		//create an object of queue
		CircularQueue c1 = new CircularQueue(4);
		for(int i=0;i<=4;i++)
		{
			c1.enqueue(i*10);
			c1.display(); 
		}
		System.out.println("***** Dequeue *****");
		c1.dequeue();
		c1.dequeue();
		c1.display();
		
		System.out.println("***** Circular Operation *****");
		c1.enqueue(40);
		c1.display();
		
		c1.enqueue(50);
		c1.display();

		c1.enqueue(60);
	}

}