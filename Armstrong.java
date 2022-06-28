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
		while(i!=0)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
			i=i/10;
		}
		if(sum==n)
			System.out.println("Armstrong number."+sum);
		else
			System.out.println("not an Armstrong number."+sum);
	}
}
