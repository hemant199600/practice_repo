
import java.util.Scanner;
public class Print_FST
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
		System.out.println("First Element  : "+a[0]);
		System.out.println("Second Element : "+a[1]);
		System.out.println("Third Element  : "+a[2]);
	}
}
