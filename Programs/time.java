import java.util.*;
public class time{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String starttime=sc.nextLine();
		String s[]=starttime.split(":");
		int late=0;
		int c=0;
		while(c<n){
			String atime=scx.nextLine();
			String a[]=atime.split(":");
			if(a[0] > s[0])
				late++;
			else if(a[1] > s[1])
				late++;
			c++;			
		}
		if(late>(n-m))
			System.out.print("yes");
		else
			System.out.print("no");
	}
}