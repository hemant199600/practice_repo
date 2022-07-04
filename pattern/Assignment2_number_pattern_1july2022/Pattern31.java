class Pattern31
{
	public static void main(String args[])
	{
		
		for(int i=5;i>=1;i--)
		{
			
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
				
				/*if(j<=i)
					System.out.print(i+" ");
				else
					System.out.print(c+" ");*/
			}
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(i+" ");
				
				/*if(j<=i)
					System.out.print(i+" ");
				else
					System.out.print(c+" ");*/
			}
			
			System.out.println();
		}
	}
}
