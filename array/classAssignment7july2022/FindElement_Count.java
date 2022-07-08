import java.util.Scanner;
public class FindElement_Count
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter "+(i+1)+"th Element: ");
			a[i]=sc.nextInt();
			
		}
		System.out.print("Enter element for search: ");
		int n=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(a[i]==n)
			{
				c++;
			}
		}
		if(c>0)
			System.out.println("\nElement Found: "+c+" times.");
		else
			System.out.println("Element not Found.");
	}
}
