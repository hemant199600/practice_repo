/*
      A 
     B B 
    C C C 
   D D D D 
  E E E E E 
 F F F F F F 
G G G G G G G 
*/
class Pattern26
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
				System.out.print((char)(c+i)+" ");	
			}
		System.out.println();
		}
	}
}
