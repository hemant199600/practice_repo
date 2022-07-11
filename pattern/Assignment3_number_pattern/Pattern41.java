/*
5432112345
5432  2345
543    345
54      45
5        5

*/
public class Pattern41
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
				System.out.print(j);
			for(int j=i-1;j>=1;j--)
				System.out.print("  ");
			for(int j=i;j<=5;j++)
				System.out.print(j);
			System.out.println();
		}
	}
}
