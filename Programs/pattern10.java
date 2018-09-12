/*
* * * * *
  * * * *
    * * *
      * *
        *
*/
import java.util.*;
public class pattern10
{
	public static void main(String[] args)
	{
		int j,i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
					System.out.print("  ");
			}
			for(;j<=3;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
