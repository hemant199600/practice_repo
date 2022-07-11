/*
1234554321
1234  4321
123    321
12      21
1        1
*/
public class Pattern42
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
				System.out.print(j);
			for(int j=i-1;j>=1;j--)
				System.out.print("  ");
			for(int j=6-i;j>=1;j--)
				System.out.print(j);
			System.out.println();
		}
	}
}
