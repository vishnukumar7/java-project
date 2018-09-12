package datastructure;

import java.util.Scanner;

public class stack {
	protected int max_size=0;
	protected int stack[];
	protected int top=-1;
	stack(int size)
	{
		max_size=size;
		stack=new int[size];
	}
	protected void push(int data)
	{
		if(isFull())
		{
			throw new IndexOutOfBoundsException("Stack is full");
		}
		else
		{
			stack[++top]=data;
		}
	}
	protected int pop()
	{
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("stack is Empty");
		}
		else
		{
			return stack[top--];
		}
	}
	protected boolean isFull()
	{
		if(top==max_size-1)
			return true;
		return false;
	}
	protected boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	protected void display()
	{
		System.out.print("The stack element is :");
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]+" ");
		System.out.println();	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter the stack size :  ");
		stack s=new stack(sc.nextInt());
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
						s.push(data);
						break;
					}
					catch(Exception e) 
					{
						System.out.print(e.getMessage());
					}
				case 2:
					try
					{
						System.out.println("the popped Element is :  "+s.pop());
						break;
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				case 3:
					s.display();
					break;
			}
			sc.nextLine();
			System.out.print("continue ?  :  ");
			str=sc.nextLine();
		}while(str.equals("y"));
		sc.close();
	}

}
