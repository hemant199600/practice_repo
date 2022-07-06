import java.util.Scanner;
public class Find_Avg5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int sum=0;
		System.out.print("Enter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			if(i<5)
			 sum=sum+a[i];
		}
		System.out.println("-----------------");
		System.out.println("Average of first five Elements : "+(sum/5));
	}
}
