class Pattern_Square
{
	public static void main(String args[])
	{	
		int c=0;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==i)
					System.out.print((++c*c)+" ");
				else
					System.out.print(++c+" ");				
			}
		System.out.println();
		}
	}
}

