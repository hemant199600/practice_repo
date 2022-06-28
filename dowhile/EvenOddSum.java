/*
2:Sum of Even and odd
*/
import java.util.Scanner;
class EvenOddSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,esum=0,osum=0,rem;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		do
		{
			rem=n%10;
			if(rem%2==0)
				esum=esum+rem;
			else
				osum=osum+rem;

			n=n/10;
		}while(n!=0);
		System.out.println("Sum of Even: "+esum);
		System.out.println("Sum of odd : "+osum);		
	}
}
