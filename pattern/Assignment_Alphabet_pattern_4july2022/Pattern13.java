/*
     A 
    A A 
   A B A 
  A C C A 
 A D F D A 
A E J J E A 

*/
class Pattern13
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>i;j--)
				System.out.print(" ");
			int c=1;
			int p=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p+" ");
				p=65;
				c=c*(i-j)/j;
				if(c>1)
				{
					p=p+c-1;
				}
				
			}
		System.out.println();
		}
	}
}
