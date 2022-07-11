/*
1 
2 1 2 
3 2 1 2 3 
4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
4 3 2 1 2 3 4 
3 2 1 2 3 
2 1 2 
1 
*/
public class Pattern46
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
