/*
	G 
       F G 
      E F G 
     D E F G 
    C D E F G 
   B C D E F G 
  A B C D E F G 
*/
class Pattern24
{
	public static void main(String args[])
	{
		for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=7-i;j--)
			{
				System.out.print(" ");
			}			
			int c=64;
			for(int j=i;j<=7;j++)
			{
				System.out.print((char)(c+j)+" ");	
			}
		System.out.println();
		}
	}
}
