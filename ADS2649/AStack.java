//Name:- Satish Rathod
//Roll No:- 2649
//Module 3:- Stacks
//Array Implementation of Stacks

import java.util.Scanner;

class Stack
{
    int n;
    int tos;
    int[] arr;

    public Stack(int size)
    {
        n = size;
        arr = new int[n];
        tos = -1;
    }

    // Push
    public void Push(int x)
    {
        if(tos == n - 1)
        {
            System.out.println("Stack Overflow");
            return;
        }

        tos++;
        arr[tos] = x;
    }

    // Pop
    public void Pop()
    {
        if(tos == -1)
        {
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.println("Element popped is: " + arr[tos]);
        tos--;
    }

    // Peek
    public void Peek()
    {
        if(tos == -1)
        {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Element at the TOS: " + arr[tos]);
    }

    // Display
    public void Display()
    {
        if(tos == -1)
        {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Stack Elements:");

        for(int i = tos; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}
//end of class Stack


class AStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Stack s = new Stack(5);

        int choice, d;

        do
        {
            System.out.println("\n*** Stack Array Implementation ***\n");

            System.out.println("1. Push an element on the stack");
            System.out.println("2. Pop an element from the stack");
            System.out.println("3. Peek at the stack");
            System.out.println("4. Display the stack");
            System.out.println("5. Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    	System.out.print("Enter element to push: ");
                    	d = sc.nextInt();
                    	s.Push(d);
                    	break;

                case 2:
                    	s.Pop();
                    	break;

                case 3:
                    	s.Peek();
                    	break;

                case 4:
                    	s.Display();
                    	break;

                case 5:
                    	System.out.println("Exiting...");
                    	System.exit(1);

                default:
                    	System.out.println("Incorrect choice!");
                    	break;
            }//end of switch

        } while(choice != 5);  //end of do while

        
    }//end of main function 
}
//end of class AStack
