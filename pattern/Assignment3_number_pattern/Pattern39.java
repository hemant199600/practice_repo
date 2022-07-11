/*
1 
3 2 
4 5 6 
10 9 8 7 
11 12 13 14 15
*/
public class Pattern39
{
	public static void main(String args[])
	{
		int c=1,k=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(k+" ");
					k--;
					c++;
				}
				else
				{
					System.out.print(c+" ");
					k=c;
					k=k+i+1;
					c++;
					
				}
			}
			System.out.println();
		}
	}
}
