import java.util.Scanner;
public class Pos_Count_Odd
{
	public static void main(String args[])
	{
		int c=0,sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.print("\n\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			if(i%2==1)
			{
				System.out.println(a[i]);
				c++;
			}
		}
		System.out.println("Count of Odd Position Element: "+c);
	}
}
