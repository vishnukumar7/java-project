package datastructure;

import java.util.Scanner;

public class queueUsingStack {
	protected stack stack1;
	protected stack stack2;
	queueUsingStack(int size)
	{
		stack1=new stack(size);
		stack2=new stack(size);
	}
	protected void enQueue(int data)
	{
		if(stack1.isFull())
		{
			throw new IndexOutOfBoundsException("queue is Full");
		}
		else
		{
			stack1.push(data);
		}
	}
	protected void push_enQueue(int data)
	{
		stack2.push(data);
	}
	protected int deQueue()
	{
		if(stack1.isEmpty() &&  stack2.isEmpty())
		{
			throw new IndexOutOfBoundsException("queue is Empty");
		}
		else
		{
			if(stack2.isEmpty())
			{
				while(stack1.top!=-1)
				{
					push_enQueue(stack1.pop());
				}
			}
			return stack2.pop();
		}
	}
	protected void display()
	{
		System.out.print("The queue Element is :  ");
		for(int i=stack2.top;i>=0;i--)
			System.out.print(stack2.stack[i]+" ");
		for(int i=0;i<=stack1.top;i++)
			System.out.print(stack1.stack[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter the queue size :  ");
		queueUsingStack qs=new queueUsingStack(sc.nextInt());
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
						qs.enQueue(data);
						break;
					}
					catch(Exception e) 
					{
						System.out.print(e.getMessage());
					}
				case 2:
					try
					{
						System.out.println("the deQueue Element is :  "+qs.deQueue());
						break;
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				case 3:
					qs.display();
					break;
			}
			sc.nextLine();
			System.out.print("continue ?  :  ");
			str=sc.nextLine();
		}while(str.equals("y"));
		sc.close();
	}

}
