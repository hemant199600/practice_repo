import java.util.*;
class Sorting_Asc
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
		System.out.print("Enterd Elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
			}
		}
		System.out.print("Sorted Ascending: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
