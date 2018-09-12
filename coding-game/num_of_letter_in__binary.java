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
        long start = in.nextLong();
        long n = in.nextLong();
        long same=0;
        while(n--!=0)
        {
            long m=0;
            while(start!=0)
            {
                long a=start%2;
                if(a==0)
                    m+=4;
                else
                    m+=3;
                start/=2;
            }
            start=m;
            if(same==start)
                break;
            else
                same=m;
        }

        System.out.println(start);
    }
}
