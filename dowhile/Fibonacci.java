import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i=1,a=0,b=1,c=0;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		System.out.print("Fibonacci serirs : "+a+" "+b+" ");
		while(i<n)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		
	}
}
