import java.util.Scanner;
public class FindElement_Duplicate_Count
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter "+(i+1)+"th Element : ");
			a[i]=sc.nextInt();
			
		}
		System.out.println("\t finding duplicate....");
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found : "+a[j]);
					c++;
				}
			}
		}
		if(c>0)
			System.out.println("\nDuplicates Found: "+c+" times.");
		else
			System.out.println("Duplicate not Founds.");
	}
}
