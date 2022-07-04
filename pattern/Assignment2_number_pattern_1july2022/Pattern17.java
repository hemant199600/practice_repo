class Pattern17
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=1;i<=5;i+=2)
		{
			for(int j=1;j<=(5-i)/2;j++)
				System.out.print(" ");
			for(int j=c;j<=5;j++)
				System.out.print(j);

			System.out.print("\n");
			c++;

		}
		int k=5;int l=1;
		for(int i=1;i<=10;i+=2,l++)
		{
			for(int j=1;j<=(10-i)/2;j++)
				System.out.print(" ");
			for(int j=1;j<=l;j++,k--)
			{
				System.out.print(k);
				
			}

			System.out.println();
		}
	}
}
