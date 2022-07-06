
import java.util.Scanner;
public class Input_Print
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("-------Array Elements-----");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
}
