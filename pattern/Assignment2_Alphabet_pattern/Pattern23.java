/*
      A
     ABA
    ABCBA
   ABCDCBA
  ABCDEDCBA
 ABCDEFEDCBA
ABCDEFGFEDCBA
*/
class Pattern23
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7-i;j++)
			{
				System.out.print(" ");
			}			
			int c=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(c+j));
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print((char)(c+j));
			}
		System.out.println();
		}
	}
}
