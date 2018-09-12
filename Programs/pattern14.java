/*
******
*    *
*    *
******
*/
import java.util.*;
public class pattern14
{
	public static void main(String[] args)
	{
		int j,i,n;
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
