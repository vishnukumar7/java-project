import java.util.Scanner;

public class match_making {
	private int N,free;
	private String man[],woman[],manPerfer[][],womanPerfer[][];
	private int engagedCount=0;
	private String womanengaged[];
	private boolean manengaged[];
	match_making(int n,String m[],String w[],String mp[][],String wp[][])
	{
		N=n;
		man=m;
		woman=w;
		manPerfer=mp;
		womanPerfer=wp;
		womanengaged=new String[N];
		manengaged=new boolean[N];
	}
	private void matching()
	{
		while(engagedCount<N)
		{
			for(free=0;free<N;free++)
				if(!manengaged[free])
					break;
			for(int i=0;i<N && !manengaged[free];i++)
			{
				int index=womanIndexOf(manPerfer[free][i]);
				if(womanengaged[index]==null)
				{
					womanengaged[index]=man[free];
					manengaged[free]=true;
					engagedCount++;
				}
				else
				{
					String current=womanengaged[index];
					if(morePerfer(current,man[free],index))
					{
						womanengaged[index]=man[free];
						manengaged[free]=true;
						manengaged[manIndexOf(current)]=false;
					}
				}
			}
		}
	}
	private boolean morePerfer(String current,String newPartner,int index)
	{
		for(int i=0;i<N;i++)
		{
			if(womanPerfer[index][i].equals(current))
				return false;
			if(womanPerfer[index][i].equals(newPartner))
				return true;
		}
		return false;
	}
	private int manIndexOf(String str) 
	{
		for(int i=0;i<N;i++)
			if(man[i].equals(str))
				return i;
		return -1;
	}
	private int womanIndexOf(String str)
	{
		for(int i=0;i<N;i++)
			if(woman[i].equals(str))
				return i;
		return -1;
	}
	private void display()
	{
		System.out.println("coupes are :  ");
		for(int i=0;i<N;i++)
			System.out.println(womanengaged[i]+" - "+woman[i]);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the man name:  ");
		String mans=sc.nextLine();
		String man[]=mans.split(" ");
		int length=man.length;
		System.out.println("Enter the woman name:  ");
		String womans=sc.nextLine();
		String woman[]=womans.split(" ");
		
		String manPerfer[][]=new String[length][length];
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter the man "+man[i]+" Perference");
			for(int j=0;j<length;j++)
				manPerfer[i][j]=sc.next();
		}
		String womanPerfer[][]=new String[length][length];
		for(int i=0;i<length;i++)
		{System.out.println("Enter the woman "+woman[i]+" Perference");
			for(int j=0;j<length;j++)
				womanPerfer[i][j]=sc.next();
		}
		match_making mm=new match_making(length,man,woman,manPerfer,womanPerfer);
		mm.matching();
		mm.display();
		sc.close();
	}

}
