import java.util.Scanner;
public class Find_Avg
{
	public static void main(String args[])
	{
		double sum=0,c=0;
		Scanner sc=new Scanner(System.in);
		double a[]=new double[10];
		System.out.print("Enter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextDouble();
			sum=sum+a[i];
			c++;
		}
		System.out.println("-----------------");
		System.out.println(" Average of Array Elements : "+(sum/c));
	}
}
