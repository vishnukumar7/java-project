/*
5
egg
goat
tiger
mirst
rampage
3
egg

output : tiger

Explantion : egg goat tiger
*/
import java.io.*;
public class StartEndLetter{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s[]=new String[n];
		for(int i=0;i<n;i++)
			s[i]=br.readLine();
		int m=Integer.parseInt(br.readLine());
		String st=br.readLine();
		int count=1;
			for(int i=0;i<n;i++){
				if(count==m)
				{
					System.out.print(st);
					break;
				}
				int len=st.length();
				char ch[]=st.toCharArray();
				for(int j=0;j<n;j++){
					char sh[]=s[j].toCharArray();
					if(ch[len-1]==sh[0]){
						count++;
						st=s[j];
						break;
					}
			}
		}
		
	}
}
