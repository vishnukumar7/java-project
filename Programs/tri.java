import java.util.*;
public class tri{
	int zero(int a,int b,int d){
		int c[]=new int[3];
		c[0]=a;
		c[1]=b;
		c[2]=d;
		for(int i=0;i<2;i++){
			for(int j=i+1;j<3;j++){
				if(c[i]>c[j]){
					int t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
			}
			
		}
		System.out.print(c[0]+" "+c[1]+" "+c[2]+" ");
		return 0;
	}
	public static void main(String args[]){
		tri TRI=new tri();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1 = s.split(" ");
		int n=s1.length;
		int a[]=new int[n];
		int b[]=new int[100];
		for(int i=0;i<n;i++)
			a[i]=Integer.valueOf(s1[i]);
		int add=0,v=0,c=0,count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					
					if(i==j || j==k || k==i)
						continue;
					else
					{
						add=a[i]+a[j]+a[k];
						if(add==0)
						{
							c=0;
							for(int l=0;l<v;l++){
								if(b[l]==a[i] || b[l]==a[j] || b[l]==a[k])
									c++;
							}
						if(c<2){
						b[v++]=a[i];
						b[v++]=a[j];
						b[v++]=a[k];
						count++;
						TRI.zero(a[i],a[j],a[k]);
						}
						}
					}
				}
			}
		}
		
		if(count==0)
		System.out.print("None");
			
		
	}
}