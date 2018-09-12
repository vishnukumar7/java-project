public class pattern20
{
	public static void main(String[] args)
	{
		int j,i;
		for(i=3;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
					System.out.print(" ");
			}
			for(;j<3;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}