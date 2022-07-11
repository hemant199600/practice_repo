/*
1 
2 3 2 
3 4 5 4 3 
4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 
4 5 6 7 6 5 4 
3 4 5 4 3 
2 3 2 
1 
*/
public class Pattern44
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
				c++;
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print((c-2)+" ");
				c--;
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			c=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			c=c-2;
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(c+" ");
				c--;
			}
			System.out.println();
		}
	}
}
