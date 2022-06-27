import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,rev=0,rem;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		i=n;
		while(i!=0)
		{
			rem=i%10;         //finding reminder
			rev=rev*10+rem;   //calculating reverse
			i=i/10;           //updating i 
		}
		if(n==rev)
			System.out.println("The number is palindrome.");
		else
			System.out.println("The number is not palindrome.");
	}
}
