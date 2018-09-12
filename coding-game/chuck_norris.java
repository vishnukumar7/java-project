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
        String MESSAGE = in.nextLine();
        String str="";
        for(int i=0;i<MESSAGE.length();i++)
        {
            char ch=MESSAGE.charAt(i);
            int a=ch;
            String s="";
            while(a!=0)
            {
                s=a%2+s;
                a/=2;
            }
            while(s.length()!=7)
                s="0"+s;
            str+=s;
        }
        for(int j=0;j<str.length();)
        {
            if(str.charAt(j)=='0')
            {
                System.out.print("00 ");
                while(j<str.length() && str.charAt(j)=='0')
                {
                    System.out.print("0");
                    j++;
                }
            }
            else
            {
                System.out.print("0 ");
                while(j<str.length() && str.charAt(j)=='1')
                {
                    System.out.print("0");
                    j++;
                }
            }
            if(j<str.length())
                System.out.print(" ");
        }
    }
}
