import java.util.Scanner;
public class Search_Count
{
	public static void main(String args[])
	{
		int n,a[],c=0;
		a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("\tEnter elements: ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t");
			a[i]=sc.nextInt();
		}
		System.out.print("\tEnter Search elemnet: ");
		n=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(a[i]==n)
				c++;
		}
		System.out.println();
		if(c>0)
			System.out.println("\tElement found: "+c+" times.");
		else
			System.out.println("\tElement not found.");
	}
}
