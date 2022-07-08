 A B C D E F G 
  A B C D E F 
   A B C D E 
    A B C D 
     A B C 
      A B 
       A 

class Pattern25
{
	public static void main(String args[])
	{
		for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(" ");
			}			
			int c=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(c+j)+" ");	
			}
		System.out.println();
		}
	}
}
