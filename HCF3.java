import java.util.Scanner;
class HCF3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,o,i=1,hcf=0;
		System.out.print("Enter 3 numbers: ");
		n=sc.nextInt();
		m=sc.nextInt();
		o=sc.nextInt();
		while(i<=n ||i<=m||i<=o)
		{
			if(n%i==0 && m%i==0&& o%i==0)
			hcf=i;

			i++;
		}
		System.out.println("Highest Common Factor: "+hcf);
	}
}
