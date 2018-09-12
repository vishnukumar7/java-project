/*
* * *
 * *
  *
*/
import java.util.*;
public class pattern11
{
	public static void main(String[] args)
	{
		int j,i,k;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=n;i>=0;i--)
		{
			for(k=0;k<=n-i;k++)
			{
				System.out.print(" ");				
			}
			for(j=i;j<=2*i-1;j++)
			{
					System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
