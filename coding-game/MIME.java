import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            hm.put(EXT.toLowerCase(),MT);
        }
        in.nextLine();
        for (int j = 0; j < Q; j++) 
        {
            String FNAME = in.nextLine(); // One file name per line.
            String str="";
            for(int i=FNAME.length()-1;i>=0 && FNAME.charAt(i)!='.';i--)
                str=FNAME.charAt(i)+str;
            str=str.toLowerCase();
            if(hm.containsKey(str)==true && str.length()!=FNAME.length())
            {
                System.out.println(hm.get(str));
            }
            else
            {
                System.out.println("UNKNOWN");
            }
            
        }

    }
}
