
import java.util.Scanner;
public class Sum_First_Last
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
		System.out.println("Sum of First and Last Element: "+(a[0]+a[10-1]));
	}
}
