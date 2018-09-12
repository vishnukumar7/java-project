/*
count of common character in two string 
Input       : india
              china
Output      : 3

Explanation : i,n,a

*/
import java.io.*;
public class sameletter{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		String s2=br.readLine();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int first[]=new int[26],second[]=new int[26];
		for(int i=0;i<26;i++)
		{
			first[i]=0;
			second[i]=0;	
		}
		int len1=s1.length(),len2=s2.length(),count=0;
		for(int i=0;i<len1;i++)
			first[ch1[i]-'a']++;
		for(int i=0;i<len2;i++)
			second[ch2[i]-'a']++;
		for(int c=0;c<26;c++){
			if(first[c]!=0 && second[c]!=0)
				for(int i=0;i<first[c] && i<second[c];i++)
					count++;

		}
		System.out.print(count);
	}
}
