import java.util.Scanner;
public class Pos_Square_Even
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("\tEnter  elements: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter "+(i+1)+"th Element : ");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<10;i++)
		{
			if(i%2==1)
			{
				System.out.print((a[i]*a[i])+" ");
			}
		}
	}
}
