package datastructure;

import java.util.Scanner;

public class queue {
	protected int max_size=0;
	protected int queue[];
	protected int front=-1,rear=-1;
	queue(int size)
	{
		max_size=size;
		queue=new int[size];
	}
	protected void enQueue(int data)
	{
		if(isFull())
		{
			throw new IndexOutOfBoundsException("The queue is Full");
		}
		else
		{
			queue[++rear]=data;
		}
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
	}
	protected int deQueue()
	{
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("The queue is Empty");
		}
		else
		{
			return queue[++front];
		}
	}
	protected boolean isFull()
	{
		if(rear==max_size-1)
			return true;
		return false;
	}
	protected boolean isEmpty()
	{
		if(rear==front)
			return true;
		return false;
	}
	public void display()
	{
		System.out.print("The queue is :  ");
		for(int i=front+1;i<=rear;i++)
			System.out.print(queue[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter the queue size :  ");
		queue q=new queue(sc.nextInt());
		do
		{
			System.out.println("1.enQueue \n2.deQueue\n3.display");
			int a=sc.nextInt();
			switch(a)
			{
				case 1:
					try
					{
						System.out.print("Enter the data :    ");
						int data=sc.nextInt();
						q.enQueue(data);
						break;
					}
					catch(Exception e) 
					{
						System.out.print(e.getMessage());
					}
				case 2:
					try
					{
						System.out.println("the deQueue Element is :  "+q.deQueue());
						break;
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				case 3:
					q.display();
					break;
			}
			sc.nextLine();
			System.out.print("continue ?  :  ");
			str=sc.nextLine();
		}while(str.equals("y"));
		sc.close();
	}

}
