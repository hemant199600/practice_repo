
import java.util.Scanner;
public class Print_Sum_FST
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter elements: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sum of first 3 element : "+(a[0]+a[1]+a[2]));
	}
}
