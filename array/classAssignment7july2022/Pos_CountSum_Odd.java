import java.util.Scanner;
public class Pos_CountSum_Odd
{
	public static void main(String args[])
	{
		int c=0,sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter "+(i+1)+"th Element: ");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<10;i++)
		{
			if(i%2==1)
			{
				sum=sum+a[i];
				c++;
			}
		}
		System.out.println("Count of Odd Position Element: "+c);
		System.out.println("Sum of Odd Position Element  : "+sum);
	}
}
