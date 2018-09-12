import java.util.*
public class string{
  public static void main(String s[]){
    Scanner sc=new Scanner(System.in);
    String s2=sc.nextLine();
    String s1=sc.nextLine();
    char ch1[]=s1.toCharArray();
    char ch2[]=s2.toCharArray();
    int len1=s1.length(),len2=s2.length(),count=0;
    for(int i=0;i<len1;i++){
        for(int j=0;j<len2;j++){
                if(ch1[i]==ch2[j]){
                System.out.print(ch[i]);
                i++;
                count++;
                }
       }
       if(count>0)
       break;
    }
  }
}
