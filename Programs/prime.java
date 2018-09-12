/*
prime number
*/
public class prime
{
	public static void main(String s[])
	{
		int n,i,m=0,flag,j,c=0;
		n=Integer.parseInt(System.console().readLine());
		for(i=2;i<=n;i++)
		{	
			flag=0;
			m=i/2;
			for(j=2;j<=m;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
				
			}
			if(flag==0)
			{
				c++;
				System.out.print(i+" ");
			}
				
		}
		System.out.println("\ncount="+c);
	}
}
