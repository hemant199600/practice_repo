/*
9: Frequency
*/
import java.util.Scanner;
class SearchFreq
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,rem;
		System.out.print("Enter big number: ");
		int k=sc.nextInt();
		System.out.print("Enter finding number: ");
		n=sc.nextInt();
		int c=0;
		i=k;
		do
		{
			
			rem=i%10;
			if(rem==n)
			{
				c++;
				
			}
			i=i/10;
		}while(i!=0);
		if(c>0)
			System.out.println("The number is found "+c+" times.");
		else
			System.out.println("The number is not found.");
	}
}
