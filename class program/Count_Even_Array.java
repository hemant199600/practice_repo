/*WAP input 10 elements in array count all even numbers;*/
import java.util.Scanner;
public class Count_Even_Array
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.print("\n\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			  c++;
		}
		System.out.println("\t-----------------");
		System.out.println("\t Total Even nos: "+c);
	}
}
