/*Q6.Wap enter an array and search any two element and print the result.*/

import java.util.*;
class Searching_Two_Elements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array Element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter Searching Elements: ");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s1)
				System.out.println(s1+" found at "+(i+1)+" position.");
			if(a[i]==s2)
				System.out.println(s2+" found at "+(i+1)+" position.");
		}	
		System.out.println();
	}
}
