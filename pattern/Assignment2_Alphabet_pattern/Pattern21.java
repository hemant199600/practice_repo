/*
      A 
     A B 
    A B C 
   A B C D 
  A B C D E 
 A B C D E F 
A B C D E F G 
*/
class Pattern21
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7-i;j++)
			{
				System.out.print(" ");
			}			
			int c=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)c+" ");
				c++;	
			}
		System.out.println();
		}
	}
}
