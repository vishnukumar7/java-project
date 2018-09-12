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
        LinkedList<Character> li=new LinkedList<Character>();
        String expression = in.next();
        int i=0;
        char ch[]=expression.toCharArray();
        int f=0;
        while(i!=expression.length() && f==0)
        {
            if(li.size()==0)
            {
                if(ch[i]=='[' || ch[i]=='{' || ch[i]=='(')
                {
                    li.add(ch[i]);
                }
                else if(ch[i]==']' || ch[i]=='}' || ch[i]==')') 
                {
                    f=1;
                }
            }
            else
            {
                if(ch[i]=='[' || ch[i]=='{' || ch[i]=='(')
                {
                    li.add(ch[i]);
                }
                else if(ch[i]=='}' && li.getLast()=='{')
                {
                    li.removeLast();
                }
                else if(ch[i]==']' && li.getLast()=='[')
                {
                    li.removeLast();
                }
                else if(ch[i]==')' && li.getLast()=='(')
                {
                    li.removeLast();
                }
                else if(ch[i]=='[' || ch[i]=='{' || ch[i]=='(' || ch[i]==']' || ch[i]=='}' || ch[i]==')')
                    f=1;
                
            }   
            i++;
        }
        if(f==1 || li.size()!=0)
            System.out.println("false");
        else
            System.out.println("true");
    }
}
