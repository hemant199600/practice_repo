import java.util.Scanner;
public class First_Last_Sum
{
	public static void main(String args[])
	{
		int c=0,sum;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("\tEnter  elements: ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t");
			System.out.print("Enter "+(i+1)+"th Element : ");
			a[i]=sc.nextInt();
			
		}
		sum=a[0]+a[4];
		for(int i=0;i<5;i++)
		{
			if(a[i]==sum)
			{
				System.out.print("\n\tElement found at "+(i+1)+"th position.");
			}
		}
		System.out.println();
	}
}
