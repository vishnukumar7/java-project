/*
Sample Input 0

7 11
5 15
3 2
-2 2 1
5 -6

Sample Output 0

1
1
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int count1=0,count2=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            apple[apple_i]+=a;
            if((t>=apple[apple_i]) && (s<=apple[apple_i])){
                count1++;
            }
            
                
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            orange[orange_i]+=b;
            if((t>=orange[orange_i]) && (s<=orange[orange_i])){
                count2++;
            }
        }
        System.out.print(count1+"\n"+count2);
        
        
    }
}
