/*
1 
1 2 
1 2 3 
1 2 3 5 
1 2 3 5 8 
*/
class Pattern32
{
	public static void main(String args[])
	{
		
		int v=(5/2)+1;
		for(int i=1;i<=5;i++)
		{
			int a=1;
			for(int j=1;j<=i;j++)
			{
				if(j>v)
				{
					int temp=j+a;
					System.out.print(temp+" ");
					a+=2;
				}
				else
				{
					System.out.print(j+" ");
				}
			}
		
		System.out.println();
		}
	}
}
