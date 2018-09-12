/*

Sample Input

07:05:45PM

Sample Output

19:05:45
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String[] time = in.nextLine().split(":");
        
        String hrs = time[0];
        String mins = time[1];
        String secs = time[2].substring(0,2);
        String de = time[2].substring(2,4);
        if(de.equals("AM"))
            System.out.println((hrs.equals("12")?"00":hrs) +":"+mins+":"+secs);
        else{
          int  t=Integer.parseInt(hrs)+12;
            System.out.println((hrs.equals("12")?hrs:t)+":"+mins+":"+secs);
        }
    }
}
