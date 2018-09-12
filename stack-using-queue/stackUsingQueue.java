package datastructure;

import java.util.Scanner;

public class stackUsingQueue {
	private queue queue1;
	private queue queue2;
	stackUsingQueue(int size)
	{
		queue1=new queue(size);
		queue2=new queue(size);
	}
	protected void push(int data)
	{
		if(queue1.isFull())
		{
			throw new IndexOutOfBoundsException("Stack is full");
		}
		else
		{
			queue1.enQueue(data);
		}
	}
	protected void push_queue(int data)
	{
		queue2.enQueue(data);
	}
	protected int pop()
	{
		if(queue1.isEmpty())
		{
			throw new IndexOutOfBoundsException("stack is Empty");
		}
		else
		{
			while(queue1.front+1!=queue1.rear)
				push_queue(queue1.deQueue());
			int temp=queue1.deQueue();
			while(queue2.front!=queue2.rear)
				queue1.enQueue(queue2.deQueue());
			return temp;
		}
	}
	protected void display()
	{
		System.out.print("The stack element is :");
		for(int i=queue1.front+1;i<=queue1.rear;i++)
			System.out.print(queue1.queue[i]+" ");
		System.out.println();	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter the stack size :  ");
		stackUsingQueue sq=new stackUsingQueue(sc.nextInt());
		do
		{
			System.out.println("1.push \n2.pop\n3.display");
			int a=sc.nextInt();
			switch(a)
			{
				case 1:
					try
					{
						System.out.print("Enter the data :    ");
						int data=sc.nextInt();
						sq.push(data);
						break;
					}
					catch(Exception e) 
					{
						System.out.print(e.getMessage());
					}
				case 2:
					try
					{
						System.out.println("the popped Element is :  "+sq.pop());
						break;
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				case 3:
					sq.display();
					break;
			}
			sc.nextLine();
			System.out.print("continue ?  :  ");
			str=sc.nextLine();
		}while(str.equals("y"));
		sc.close();
	}

}
