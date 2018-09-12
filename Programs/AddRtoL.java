/*
addition to two number right to left
Input:

16282
5964

Output:

11257
*/

import java.util.*;
public class AddRtoL {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int len1=s1.length(),len2=s2.length();
		for(int i=0;i<len1 || i<len2;i++)
		{
		    if(i>=len1)
		        s1="0"+s1;
		    if(i>=len2)
		        s2="0"+s2;
		}
		char ch3[]=s1.toCharArray();
		char ch4[]=s2.toCharArray();
		int c=0;
		for(int i=0;i<s1.length() || i<s2.length();i++){
            c+=Character.getNumericValue(ch3[i])+Character.getNumericValue(ch4[i]);
		        System.out.print(c%10);
		        c/=10;
		}
        if(c!=0)
            System.out.print(c);
	}
}
