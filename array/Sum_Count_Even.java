import java.util.Scanner;
public class Sum_Count_Even
{
	public static void main(String args[])
	{
		int c=0,sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.print("\n\tEnter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
			  c++;
			  sum=sum+a[i];
			}
		}
		System.out.println("\t-----------------");
		System.out.println("\t Total Even nos: "+c);
		System.out.println("\t Sum Even nos  : "+sum);
	}
}
