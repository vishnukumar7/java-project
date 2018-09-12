package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class setOfPlates {
	private int max_size=0;
	ArrayList<stack> setOfStack=new ArrayList<stack>();
	setOfPlates(int size)
	{
		max_size=size;
		setOfStack.add(new stack(size));
	}
	protected void push(int data)
	{
		stack last_stack=setOfStack.get(setOfStack.size()-1);
		if(last_stack.isFull())
		{
			setOfStack.add(new stack(max_size));
			last_stack=setOfStack.get(setOfStack.size()-1);
		}
		last_stack.push(data);
	}
	protected int pop()
	{
		int position=setOfStack.size()-1;
		stack last_stack=setOfStack.get(position);
		while(last_stack.isEmpty())
		{
			last_stack=setOfStack.get(--position);
		}
		if(position==-1)
		{
			throw new IndexOutOfBoundsException("All stack is Empty");
		}
		else
		{
			return last_stack.pop();
		}
	}
	private int popAt(int pos)
	{
		stack position_stack=setOfStack.get(pos);
		if(position_stack.isEmpty())
		{
			throw new IndexOutOfBoundsException("position stack is Empty");
		}
		else
		{
			return position_stack.pop();
		}
	}
	protected void display()
	{
		int all_data=setOfStack.size()-1;
		int index=0;
		while(index<=all_data)
		{
			stack stack=setOfStack.get(index);
			System.out.print("The stack "+index+" is :  ");
			for(int i=0;i<=stack.top;i++)
				System.out.print(stack.stack[i]+" ");
			System.out.println();	
			index++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter the stack size :  ");
		setOfPlates sp=new setOfPlates(sc.nextInt());
		do
		{
			System.out.println("1.push \n2.pop\n3.popAt\n4.display");
			int a=sc.nextInt();
			switch(a)
			{
				case 1:
					try
					{
						System.out.print("Enter the data :    ");
						int data=sc.nextInt();
						sp.push(data);
						break;
					}
					catch(Exception e) 
					{
						System.out.print(e.getMessage());
					}
				case 2:
					try
					{
						System.out.println("the popped Element is :  "+sp.pop());
						break;
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				case 3:
					try
					{
						System.out.print("Enter the position to be popped :  ");
						int position=sc.nextInt();
						System.out.println("the popped Element is :  "+sp.popAt(position));
						break;
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				case 4:
					sp.display();
					break;
			}
			sc.nextLine();
			System.out.print("continue ?  :  ");
			str=sc.nextLine();
		}while(str.equals("y"));
		sc.close();
	}

}
