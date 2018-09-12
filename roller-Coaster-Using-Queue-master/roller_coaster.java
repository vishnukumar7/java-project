package datastructure;

import java.util.Scanner;

public class roller_coaster {
	private queue queue;
	private int rides;
	private int capacity;
	private int euro=0,index=0;
	private int max_size=0,sum=0;
	roller_coaster(int r,int cap,int size)
	{
		rides=r;
		capacity=cap;
		max_size=size;
		queue=new queue(1000);
	}
	private void enQueue(int data)
	{
		queue.enQueue(data);
	}
	private int ride()
	{
		if(rides==0)
			return euro;
		else
		{
			int temp=queue.queue[queue.front+1];
			if(sum+temp<=capacity && index!=max_size)
			{
				index++;
				sum+=temp;
				queue.enQueue(queue.deQueue());
			}
			else
			{
				index=0;
				euro+=sum;
				sum=0;
				rides--;
			}
			return ride();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of rides : ");
		int ride=sc.nextInt();
		System.out.print("Enter the number of capacity in one ride :   ");
		int capacity=sc.nextInt();
		
		System.out.print("Enter the group of person in queue(using space): ");
		sc.nextLine();
		String str=sc.nextLine();
		String sp[]=str.split(" ");
		roller_coaster rc=new roller_coaster(ride,capacity,sp.length);
		for(int i=0;i<sp.length;i++)
			rc.enQueue(Integer.parseInt(sp[i]));
		System.out.println(rc.ride()+"  EURO");
		sc.close();
	}

}
