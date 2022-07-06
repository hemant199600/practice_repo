/*   WAP input 10 elements in find sum and avg;*/
import java.util.Scanner;
public class Array_Sum_Avg
{
	public static void main(String args[])
	{
		double sum=0,c=0;
		Scanner sc=new Scanner(System.in);
		double a[]=new double[10];
		System.out.print("\n\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextDouble();
			sum=sum+a[i];
			c++;
		}
		System.out.println("\t-----------------");
		System.out.println("\t Sum of Array Elements : "+sum);
		System.out.println("\t Average of Array Elements : "+(sum/c));
	}
}
