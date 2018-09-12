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
        int n = in.nextInt(); // the number of temperatures to analyse
        int min=9999,max=-9999;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if(t<min && t>=0)
                min=t;
            else if(t<0 && t>max)
                max=t;
        }
        int a=-max;
        if(min<=5526 || max>=-273)
        {
            if(min==0)
                System.out.println(min);
            else if(min==a)
                System.out.println(min);
            else if(min<a)
                System.out.println(min);
            else
                System.out.println(max);
        }
        else
            System.out.println("0");
    }
}
