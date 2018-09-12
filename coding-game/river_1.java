import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long r1 = in.nextLong();
        long r2 = in.nextLong();
        while(true)
        {
            if(r1==r2)
            {
                System.out.println(r1);
                break;
            }
            else if(r1<r2)
            {
                while(r1<r2)
                {
                    long sum=0,n=r1;
                    while(n!=0)
                    {
                        sum+=n%10;
                        n/=10;
                    }
                    r1+=sum;
                }
            }
            else
            {
                while(r1>r2)
                {
                    long sum=0,n=r2;
                    while(n!=0)
                    {
                        sum+=n%10;
                        n/=10;
                    }
                    r2+=sum;
                }
            }
        }
    }
}
