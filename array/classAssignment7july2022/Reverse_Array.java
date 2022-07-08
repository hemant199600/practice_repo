import java.util.Scanner;
public class Reverse_Array
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("\tEnter  elements: ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t");
			System.out.print("Enter "+(i+1)+"th Element : ");
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("\n\t------Before Reverse------");
		System.out.print("\t");
		for(int i=0;i<5;i++)
		{
			System.out.print((a[i])+" ");
			
		}
		System.out.println("\n\t------After Reverse------");
		System.out.print("\t");
		for(int i=4;i>=0;i--)
		{
			System.out.print((a[i])+" ");
			
		}
		System.out.println();
	}
}
