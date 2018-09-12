public class pattern18
{
	public static void main(String[] args)
	{
		int j,i,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==j || (n-i+1)==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}