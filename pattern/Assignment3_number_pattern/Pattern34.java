/*
1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4 
*/
public class Pattern34
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
				System.out.print(j+" ");

			for(int j=1;j<=i-1;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
