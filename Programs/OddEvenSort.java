/*
input:
9
169 181 298 16 147 263 102 155 141
output:
141 147 16 102 155 169 298 181 263

*/

import java.util.*;
public class OddEvenSort {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		int b[]=new int[N];
		for(int i=0;i<N;i++){
		    a[i]=sc.nextInt();
		    b[i]=a[i];
		}
		Arrays.sort(a);
		int odd[]=new int[N];
		int even[]=new int[N];
		int x=0,y=0;
		for(int i=0;i<N;i++){
		    if(a[i]%2==0){
		        even[x]=a[i];
		        x++;
		    }
		    else{
		        odd[y]=a[i];
		        y++;
		    }
		}
		x=0;y=0;
		for(int i=0;i<N;i++){
		    if(b[i]%2==0){
		        System.out.print(even[x]+" ");
		        x++;
		    }
		    else{
		        System.out.print(odd[y]+" ");
		        y++;
		    }
		}
		
	}
}
