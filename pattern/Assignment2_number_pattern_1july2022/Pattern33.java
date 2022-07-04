/*
5 
4 5 4 
3 4 5 4 3 
2 3 4 5 4 3 2 
1 2 3 4 5 4 3 2 1 
2 3 4 5 4 3 2 
3 4 5 4 3 
4 5 4 
5 
*/
class Pattern33
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
				System.out.print(j+" ");
			for(int j=4;j>=i;j--)
				System.out.print(j+" ");

		System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)
				System.out.print(j+" ");
			for(int j=4;j>=i+1;j--)
				System.out.print(j+" ");

		System.out.println();
		}
	}
}
