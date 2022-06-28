import java.util.Scanner;
class HCF
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i=1,hcf=0;
		System.out.print("Enter 2 numbers: ");
		n=sc.nextInt();
		m=sc.nextInt();
		while(i<=n ||i<=m)
		{
			if(n%i==0 && m%i==0)
			hcf=i;

			i++;
		}
		System.out.println("Highest Common Factor: "+hcf);
	}
}
