/*
trailing zero space
*/
import java.util.*;
public class zero{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count = 0;
 
		// Keep dividing n by powers of 5 and update count
		for (int i=5; n/i>=1; i *= 5)
          count += n/i;
		System.out.print(count);
	}
}
