import java.util.Scanner;
class EvenFact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i=1,hcf=0;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		while(i<n )
		{
			if(n%i==0 && i%2==0)
				System.out.print(i+" ");
			   

			i++;
		}
		
	}
}
