import java.util.Scanner;
class Search
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
		while(i!=0)
		{
			
			rem=i%10;
			if(rem==n)
			{
				c=1;
				break;
			}
			i=i/10;
		}
		if(c==1)
			System.out.println("The number is found.");
		else
			System.out.println("The number is not found.");
	}
}
