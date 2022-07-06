/*
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 
G G G G G G G 
*/
class Pattern15
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			int c=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(i+c)+" ");
			}
		System.out.println();
		}
	}
}
