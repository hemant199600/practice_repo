import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,fact=1;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		while(n>=1)
		{
			fact=fact*n;
			
			n--;
		}
		System.out.println("factorial :"+fact);
	}
}
