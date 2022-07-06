/*     WAP input 10 elements in find sum of all even number.*/
import java.util.Scanner;
public class Sum_Even_Array
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.print("\n\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			  sum=sum+a[i];
		}
		System.out.println("\t-----------------");
		System.out.println("\t Sum of Even nos: "+sum);
	}
}
