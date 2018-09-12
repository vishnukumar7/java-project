/*
input=123456789
output=987654321
*/public class reverse
{
	public static void main(String s[])
	{
		int n,num;
		System.out.println("enter the number");
		n=Integer.parseInt(System.console().readLine());
		while(n!=0)
		{
			num=n%10;
			n=n/10;
			System.out.print(num);
		}
	}	
}
