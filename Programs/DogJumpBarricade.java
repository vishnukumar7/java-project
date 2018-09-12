\*
input:
2
10 2 4
5 14 19 22
4 1 5
6 9 11 4 6
output:
9
12

Explanation:
day : 2
x : 10  y : 2  no. of bar : 4
5 (one jump)(10-2)
14 (two jump)
19 (three jump)
22 (three jump)
1+2+3+3=9


*\
import java.util.*;
public class DogJumpBarricade {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int c=0,count=0;
		for(int i=0;i<D;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int N=sc.nextInt();
		    int a[]=new int[N];
		    count=0;
		    for(int j=0;j<N;j++)
		    {
		        a[i]=sc.nextInt();
		        c=0;
		        if(c<a[i])
		        {   
		            count++;
		            c=x;
		            while(c<a[i])
		            {
		                c+=x-y;
		                count++;
		            }
		        }
		    }
		    System.out.println(count);
		    
		}

	}
}
