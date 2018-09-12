import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static String display(String str,int n)
    {
        int a=0,b=1;
		String s[]=str.split(" ");
        a=Integer.parseInt(s[0]);
        String st="";
        for(int i=1;i<s.length;i++)
        {
            if(s[i].equals(s[i-1]))
            {
                b++;
            }
            else
            {
                st=st+""+b+" "+a+" ";
                a=Integer.parseInt(s[i]);
                b=1;
            }
				
        }
        st=st+""+b+" "+a;
        if(n<=1)
            return st;
        else
			return display(st,n-1);
	
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int L = in.nextInt();
        String r=Integer.toString(R)+" ";
        if(L==1)
            System.out.println(R);
        else
            System.out.print(display(r,L-1));
        //System.out.println("answer");
    }
}
