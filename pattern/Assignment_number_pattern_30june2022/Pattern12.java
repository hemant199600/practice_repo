/*
1 
2 7 
3 8 13 
4 9 14 19 
5 10 15 20 25
*/
class pattern12
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int c=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c=c+5;
			}
			System.out.println();
		}
	}
}
