/*
1 2 3 4 5 
2 3 4 5 1 
3 4 5 2 1 
4 5 3 2 1 
5 4 3 2 1 
*/
public class Pattern35
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
				System.out.print(j+" ");

			for(int j=i-1;j>=1;j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
