/*
1 2 3 4 5 4 3 2 1 
2 3 4 5 4 3 2 
3 4 5 4 3 
4 5 4 
5 

*/
class Pattern24
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=5;i>=1;i--,c++)
		{
			for(int j=c;j<=5;j++)
				System.out.print(j+" ");
			for(int j=4;j>=c;j--)
				System.out.print(j+" ");
			
			System.out.println();
		}
	}
}
