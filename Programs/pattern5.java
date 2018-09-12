public class pattern5
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
					if(i==j)
						System.out.print("0 ");
					else
						System.out.print("1 ");
			}
			System.out.println();
		}
	}
}