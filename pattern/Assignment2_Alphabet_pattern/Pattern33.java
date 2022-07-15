/*
ABCDEFEDCBA
ABCDE EDCBA
ABCD   DCBA
ABC     CBA
AB       BA
A         A
AB       BA
ABC     CBA
ABCD   DCBA
ABCDE EDCBA
ABCDEFEDCBA
*/
class Pattern33
{
	public static void main(String args[])
	{
		int c=65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5-i;j++)
			{
				System.out.print((char)(j+c));	
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(" ");	
			}
			for(int j=5-i;j>=0;j--)
			{
				if(j!=5)
				{
					System.out.print((char)(j+c));
				}
			}
		System.out.println();
		}
		for(int i=5-1;i>=0;i--)
		{
			for(int j=0;j<=5-i;j++)
			{
				System.out.print((char)(j+c));	
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(" ");	
			}
			for(int j=5-i;j>=0;j--)
			{
				if(j!=5)
				{
					System.out.print((char)(j+c));
				}
			}
		System.out.println();
		}
	}
}
