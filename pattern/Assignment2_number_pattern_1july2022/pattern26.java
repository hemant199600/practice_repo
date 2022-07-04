/*
5 5 5 5 5 
4 5 5 5 5 
3 4 5 5 5 
2 3 4 5 5 
1 2 3 4 5
*/
class pattern26
{
	public static void main(String args[])
	{
		/*int c;
		for(int i=5;i>=1;i--)
		{
			c=i;
			for(int j=5;j>=1;j--,c++)
			{
				if(j<=i)
					System.out.print(5+" ");
				else
					System.out.print(c+" ");
			}
			System.out.println();
		}*/
		
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(5+" ");
			}
			System.out.println();
		}
	}
}
