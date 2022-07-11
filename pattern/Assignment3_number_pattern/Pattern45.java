/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 
7 7 7 
8 8 
9 
*/
public class Pattern45
{
	public static void main(String args[])
	{
		int c=0;
		for(int i=1;i<=5;i++)
		{
			c=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		c=c+1;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}
	}
}
