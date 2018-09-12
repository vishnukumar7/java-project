/*
####/\####
###/##\###
##/#/\#\##
#/#/##\#\#
/#/#/\#\#\
\#\#\/#/#/
#\#\##/#/#
##\#\/#/##
###\##/###
####\/####

*/

import java.util.*;
public class hyb
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StringBuilder sb;
		int n=sc.nextInt();
		String s[]=new String[n];
		String str="";
		int f=0,j;
		for(int i=0;i<n;i++)
		{
			f=0;
			s[i]="";
			for(j=0;j<=n;j++)						//left part
			{
				if(j==n-i-1)
				{
					s[i]+="/";
					break;					
				}
				else 
					s[i]+="#";
			}
			for(int k=j+1;k<n;k++)
			{
				if(f==0)
				{
					s[i]+="#";
					f=1;
					
				}
				else
				{
					s[i]+="/";
					f=0;
				}
				
			}
			
			str=s[i].replace("/","\\");
			sb=new StringBuilder(str);
			s[i]+=sb.reverse();
			System.out.println(s[i]);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			char ch[]=s[i].toCharArray();
			for(j=0;j<s[i].length();j++)
			{
				if(ch[j]=='/')
					System.out.print("\\");
				else if(ch[j]=='\\')
					System.out.print("/");
				else
					System.out.print(ch[j]);
			}
			System.out.println();
		}
	}
}
