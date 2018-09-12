import java.util.*;
class swapping
{
	public static void main(String ags[])
	{
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		str1=sc.nextLine();
		str2=sc.nextLine();
		String s[]=str1.split(" ");
		int a[]=new int[s.length];
		int n=s.length;
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(s[i]);
		int b=Integer.parseInt(str2);
		if(((n-1)/2)!=b)
		{
			int temp=a[b-1];
			a[b-1]=a[n-b];
			a[n-b]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
	}
}