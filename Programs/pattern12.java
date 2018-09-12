/*
  *
 * *
* * * 
*/
import java.util.*;
public class pattern12
{
	public static void main(String[] args)
	{
		int j,i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=n;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
					System.out.print(" ");
			}
			for(;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
