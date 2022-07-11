/*
	1 
      1 2 1 
    1 2 4 2 1 
  1 2 4 8 4 2 1 
1 2 4 8 16 8 4 2 1 
*/
public class Pattern47
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int c=1;
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c=c*2;
			}
			c=c/4;
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(c+" ");
				c=c/2;
			}
			System.out.println();
		}
	}
}
