/*
   1
  1 1
 1 2 1
1 3 3 1
*/
import java.util.*;
public class pascal{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b;
		if(n>0){
			for(int i=0;i<n;i++)
				System.out.print(" ");
			System.out.println("1");
			n--;
		}
		while(n--!=0){
			a=a*11;
			b=a;
			for(int i=0;i<n;i++)
				System.out.print(" ");
			while(b!=0){
				int r=b%10;
				System.out.print(" "+r);
				b/=10;
			}
			System.out.println();
			
		}
	}
}
