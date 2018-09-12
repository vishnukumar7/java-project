import java.util.*;
public class printGrandSonName {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String sp1[]=s1.split(" ");
        String s2=sc.nextLine();
        String sp2[]=s2.split(" ");
        String s3=sc.nextLine();
        String sp3[]=s3.split(" ");
        int f=0;
            if(sp1[1].equals(sp2[0]))
            {
                if(sp2[1].equals(sp3[0]))
                    f=1;
                else
                    f=3;
            }
            else if(sp1[1].equals(sp3[0])){
                    if(sp3[1].equals(sp2[0]))
                        f=1;
                    else
                        f=2;
            }
            else if(sp2[1].equals(sp1[0])){
                if(sp1[1].equals(sp3[0]))
                    f=2;
                else
                    f=3;
            }
            else if(sp2[1].equals(sp3[0])){
                if(sp3[1].equals(sp1[0]))
                    f=2;
                else
                    f=1;
            }
            else
                f=3;
            if(f==1)
                System.out.print(s1);
            else if(f==2)
                System.out.print(s2);
            else if(f==3)
                System.out.print(s3);
        
	}
}
