/*
5: Prime Number 
*/
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i=2;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		do
		{
			if(n%i==0)
			break;
			
			i++;
		}while(i<=n);
		if(n==i||n==1)
			System.out.println("The number is prime.");
		else
			System.out.println("The number is not prime.");
	}
}
