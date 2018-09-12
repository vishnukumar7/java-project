public class perfect
{
	public static void main(String s[])
	{
		int n,num,i,a=0;
		System.out.println("enter the number");
		n=Integer.parseInt(System.console().readLine());
		for(i=1;i<n;i++)
		{
			if(n%i==0)
				a=a+i;				
		}
		if(a==n)
			System.out.print("It is perfect number");
		else
			System.out.print("It is not perfect number");
		
	}	
}