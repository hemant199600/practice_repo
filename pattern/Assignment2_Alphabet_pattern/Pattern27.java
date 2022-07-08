/*
A A A A A A A A 
A A A A A A B B 
A A A A A C C C 
A A A A D D D D 
A A A E E E E E 
A A F F F F F F 
A G G G G G G G 
*/
class Pattern27
{
	public static void main(String args[])
	{
		int c=64;
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
				System.out.print((char)65+" ");
			for(int j=1;j<=i;j++)
				System.out.print((char)(i+c)+" ");
			System.out.println();
		}
	}
}
