import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,fact=1;//int i=1;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		while(n>=1)//(i<=n)
		{
			fact=fact*n;//fact=fact*i;
			
			n--;  //i++;
		}
		System.out.println("factorial :"+fact);
	}
}
