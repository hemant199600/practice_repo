class Pattern_Ideal2
{
	public static void main(String args[])
	{
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==i)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");				
			}
		System.out.println();
		}
	}
}

