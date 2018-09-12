public class pattern16
{
	public static void main(String[] args)
	{
		int j,i,n,a=1;
		n=Integer.parseInt(System.console().readLine());
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(a%2==0)
					System.out.print("$ ");
				else
					System.out.print("* ");
				a++;
			}
			System.out.println();
		}
	}
}