/*
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
*/
class pattern13
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=0;i<5;i++)
		{
			//spacing
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0||i==0)
					c=1;
				else
					c=c*(i-j+1)/j;
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
