/*
A B C D E F G 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
*/
class Pattern19
{
	public static void main(String args[])
	{
		for(int i=1;i<=8;i++)
		{
			int c=64;
			for(int j=1;j<=8-i;j++)
			{
				System.out.print((char)(j+c)+" ");	
			}
		System.out.println();
		}
	}
}
