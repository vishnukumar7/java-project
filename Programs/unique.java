import javac.io.*;
public class unique{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    Set<String> set=new HashSet<String>();
    for(int i=0;i<n;i++)
      set.add(br.readLine())
   System.out.print(set.size());
  }
}
