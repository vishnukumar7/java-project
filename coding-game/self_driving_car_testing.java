import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    public static int road(String s)
    {
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            int a=s.charAt(i)-'0';
            if(a>=0 && a<=9)
                p=p*10+a;
            else
                break;
        }
        return p;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String xcomm = in.nextLine();
        String str[]=xcomm.split(";");
        int x=Integer.parseInt(str[0]);
        int point=road(str[1]);
        int m=2;
        char side=str[1].charAt(str[1].length()-1);
        for (int i = 0; i < N; i++) 
		{
            String rpatt = in.nextLine();
            String s[]=rpatt.split(";");
            int n=Integer.parseInt(s[0]);
    		for(int j=0;j<n;j++)
    		{
				StringBuilder sb = new StringBuilder(s[1]);
    		    if(point>0)
    		    {
    		        if(side=='S')
    		        {
    		            sb.deleteCharAt(x-1);
		                sb.insert(x-1, '#');
    		        }
    		        else if(side=='R')
    		        {
						x++;
    		            sb.deleteCharAt(x-1);
		                sb.insert(x-1, '#');
    		        }
    		        else if(side=='L')
    		        {
						x--;
    		            sb.deleteCharAt(x-1);
		                sb.insert(x-1, '#');
    		        }
    		        point--;
    		        System.out.println(sb);
    		    }
    		    else
    		    {
    		        point=road(str[m]);
                    side=str[m].charAt(str[m].length()-1);
                    m++;
                    j--;
    		    }
    		}

            
        }
    }
}
