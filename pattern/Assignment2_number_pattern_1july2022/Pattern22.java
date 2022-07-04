/*
1 0 0 0 0 
0 2 0 0 0 
0 0 3 0 0 
0 0 0 4 0 
0 0 0 0 5 

*/
class Pattern22
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{	
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(i+" ");
				else
					System.out.print(0+" ");
			}
		System.out.println();
		}
	}
}
