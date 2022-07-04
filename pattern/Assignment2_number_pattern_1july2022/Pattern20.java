/*
    1
   121
  12321
 1234321
123454321
*/
class Pattern20
{
	public static void main(String args[])
	{
		int c=1;
		int n=5;
		 n=n*2;
		for(int i=1;i<n;i+=2)
		{
			int k=2;
			for(int j=1;j<=(n-i)/2;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				
				if(j>c)
				{
					int d=j-k;
					System.out.print(d);
					k=k+2;
				}
				else
				 System.out.print(j);
				
			}
			/*for(int j=1;j<i;j++)
				System.out.print(j+"");*/
			
			System.out.println();
			c++;
		}
	}
}
