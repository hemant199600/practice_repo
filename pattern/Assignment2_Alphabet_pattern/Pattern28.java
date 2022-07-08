/*
A B C D E F G F E D C B A 
B C D E F G F E D C B 
C D E F G F E D C 
D E F G F E D 
E F G F E 
F G F 
G 
*/
class Pattern28
{
	public static void main(String args[])
	{
		int c=64;
		for(int i=1;i<=7;i++)
		{
			for(int j=i;j<=7;j++)
				System.out.print((char)(c+j)+" ");
			for(int j=6;j>=i;j--)
				System.out.print((char)(j+c)+" ");
			System.out.println();
		}
	}
}
