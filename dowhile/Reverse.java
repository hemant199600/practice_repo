/*
3:Number reverse":
*/
import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rev=0,rem;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		do
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}while(n!=0);
		System.out.println("reverse number: "+rev);
				
	}
}
