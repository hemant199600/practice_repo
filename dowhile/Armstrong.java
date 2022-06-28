import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0,rem;
		System.out.print("Enter number: ");//1630,8202;
		n=sc.nextInt();
		i=n;
		do
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
			i=i/10;
		}while(i!=0);
		if(sum==n)
			System.out.println("Armstrong number."+sum);
		else
			System.out.println("not an Armstrong number."+sum);
	}
}
