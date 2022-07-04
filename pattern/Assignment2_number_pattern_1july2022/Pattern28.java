/*
1 
2 4 
3 6 9 
4 8 12 16 
5 10 15 
6 12 
7 
*/
class Pattern28
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			int c=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c=c+i;
			}
		System.out.println();
		}
		for(int i=5;i<=7;i++)
		{
			int c=i;
			for(int j=7;j>=i;j--)
			{
				System.out.print(c+" ");
				c=c+i;
			}
		System.out.println();
		}
		
	}
}
