class Q12Pattern//incomplete
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||j==1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				
			System.out.println();
		}
			
	}	
}
	
