import java.util.*;
public class pricing{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int add=0,i=0,s=0,rem;
		while(i<n){
			if(a[i]>0){
				if(a[i]%2==1)
					add+=a[i];
				else
				{
					int n1=a[i];s=0;
					while(n1!=0){
						rem=n1%10;
						s=s*10+rem;
						n1=n1/10;
					}
					add+=s;
				}
			}
			i++;
		}
		System.out.print(add);
	}
}