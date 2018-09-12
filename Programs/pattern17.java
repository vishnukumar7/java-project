public class pattern17
{
	public static void main(String[] args)
	{
		int j,i,n,a=1;
		n=Integer.parseInt(System.console().readLine());
		for(i=1;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}