/*
Given an array arr[] of size n, find the first repeating element. The element should occurs more than once and the index of its first occurrence should be the smallest.
*/
import java.util.Scanner;
class Check_First_Occurence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.print("Enter Array Elements: ");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Occurence of first repeated element: "+a[i]+" and index is "+(i+1));
					return;
				}
					
			}
		}
		
	}
}
