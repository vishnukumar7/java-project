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
        int N = in.nextInt();
        int arr[]=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=in.nextInt();
        }
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<N-1;i++)
            if(min>Math.abs(arr[i]-arr[i+1]))
                min=Math.abs(arr[i]-arr[i+1]);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(min);
    }
}
