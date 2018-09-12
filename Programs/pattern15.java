public class pattern15
{
	public static void main(String[] args)
	{
		int j,i,n;
		n=Integer.parseInt(System.console().readLine());
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==n || j==1 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}