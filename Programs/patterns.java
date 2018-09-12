import java.util.*;
public class patterns{
	public static void main(String args[]){
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int a=st.length();
		int b=a/2;
		for(i=0;i<b;i++){
			char temp=ch[i];
			ch[i]=ch[b+i];
			ch[b+i]=temp;
		}
		for(i=b;i<a;i++){
			char temp=ch[i];
			ch[i]=ch[a-1];
			ch[a-1]=temp;
		}
		for(i=a-1;i>=0;i--){
			for(j=0;j<i;j++){
				System.out.print("*");
			}
			int s=0;
			for(k=j;k<a;k++){
				System.out.print(ch[s]);
				s++;
			}
			System.out.println();
		}}}