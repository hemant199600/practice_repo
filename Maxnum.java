import java.util.Scanner;
class Maxnum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,rem;
		System.out.print("Enter big number: ");
		int k=sc.nextInt();
		int c=0;
		i=k;
		while(i!=0)
		{
			
			rem=i%10;
			if(rem>c)
			{
				c=rem;
				
			}
			i=i/10;
		}
		System.out.println("The maxnumber is : "+c);
	}
}
