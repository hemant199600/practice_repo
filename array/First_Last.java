
import java.util.Scanner;
public class First_Last
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
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element : "+a[10-1]);
	}
}
