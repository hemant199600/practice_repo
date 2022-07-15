/*
A 
A B A 
A B C B A 
A B C D C B A 
A B C D E D C B A 
A B C D E F E D C B A 
A B C D E F G F E D C B A 
*/
class Pattern32
{
	public static void main(String args[])
	{
		int c=64;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print((char)(c+j)+" ");
			for(int j=i-1;j>=1;j--)
				System.out.print((char)(j+c)+" ");
			System.out.println();
		}
	}
}
