/*
1 1 1 1 1 
1 1 1 2 2 
1 1 3 3 3 
1 4 4 4 4 
5 5 5 5 5 
*/
class Pattern23
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=5;i>=1;i--,c++)
		{	
			for(int j=1;j<=5;j++)
			{
				if(j<i)
					System.out.print(1+" ");
				else
					System.out.print(c+" ");
			}
		System.out.println();
		}
	}
}
