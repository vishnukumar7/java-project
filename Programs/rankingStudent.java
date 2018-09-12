\*
Top Ranking Student - Maths Physics Chemistry
explanation : 3
              alice 100 90 87
              bob 100 95 56
              cipher 87 96 90
              output : bob
*\


import java.util.*;
import java.io.*;
public class rankingStudents{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String str=" ";
		int max1=0,max2=0,max3=0;
		for(int i=0;i<n;i++){
			String s=br.readLine();
			String sp[]=s.split(" ");
			int m=Integer.parseInt(sp[1]);
			int p=Integer.parseInt(sp[2]);
			int c=Integer.parseInt(sp[3]);
			if(max1==m)
			{
				if(max2==p)
				{
					if(max3<c)
					{
					str=sp1[0];
					max1=m;
					max2=p;
					max3=c;
					}
				}
				else if(max2<p)
				{
					str=sp1[0];
					max1=m;
					max2=p;
					max3=c;
				}
			}
			else if(max1<m)
			{
				str=sp1[0];
				max1=m;
				max2=p;
				max3=c;
			}
		}
		System.out.print(str);
	}
}
