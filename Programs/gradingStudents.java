/*

Sample Input 0

4
73
67
38
33

Sample Output 0

75
67
40
33
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r,b;
        for(int a = 0; a < n; a++){
            int grade = in.nextInt();
            // your code goes here
            r=grade;
            while(r%5!=0)
                r++;
            b=r-grade;
            if(grade < 38)
                System.out.println(grade);
            else if(b==3)
                System.out.println(grade);
            else if(b < 3)
                System.out.println(r);
            else
                System.out.println(grade);
        }
    }
}
