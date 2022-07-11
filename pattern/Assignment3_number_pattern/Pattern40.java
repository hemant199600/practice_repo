/*
1 
2 3 
6 5 4 
7 8 9 10 
15 14 13 12 11 
*/
public class Pattern40
{
	public static void main(String args[])
	{
		int c=1,k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==1)
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
