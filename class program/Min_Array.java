/*   WAP input 10 elements in array find minimum value*/
import java.util.Scanner;
public class Min_Array
{
	public static void main(String args[])
	{
		int min=9999;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.print("\n\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<min)
			  min=a[i];
		}
		System.out.println("\t-----------------");
		System.out.println("\t Minimum Value : "+min);
	}
}
