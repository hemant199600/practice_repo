/*
      A 
     A B 
    A B C 
   A B C D 
  A B C D E 
 A B C D E F 

*/
class Pattern6
{
	public static void main(String args[])
	{
		for(int i=65;i<=70;i++)
		{
			for(int j=70;j>=i;j--)
				System.out.print(" ");
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
		System.out.println();
		}
	}
}
