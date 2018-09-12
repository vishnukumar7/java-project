public class pattern19
{
	public static void main(String[] args)
	{
		int j,i,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
					System.out.print("* ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}